// External JavaScript network function for Kotlin/WASM
// Avoids WASM type casting issues with Response objects
//
// NEVER lets a raw JS error cross the Kotlin/WASM boundary: a rejected fetch
// (CORS block, network error, DNS) surfaces in Kotlin as a Throwable that is
// NOT an Exception subclass, escaping `catch (e: Exception)` and killing the
// coroutine exception handler (crash-retry loop on the Blog screen, Aug 25).
// Contract: return the response text on success, "" (empty string) on ANY
// failure. Kotlin maps "" to a clean IOException.

async function fetchUrlTextExternal(url) {
    try {
        const response = await fetch(url);
        if (!response.ok) {
            console.log('[DEBUG_LOG] Fetch failed, HTTP', response.status, 'for', url);
            return "";
        }
        return await response.text();
    } catch (error) {
        console.log('[DEBUG_LOG] Fetch error for', url, ':', error && error.message ? error.message : error);
        return "";
    }
}

// Make function globally available for Kotlin/WASM
window.fetchUrlTextExternal = fetchUrlTextExternal;
