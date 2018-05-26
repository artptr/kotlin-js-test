@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("dns") JsQualifier("lookup")]
package dns.lookup

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$34` {
    var address: Array<dns.LookupAddress>
}
external fun __promisify__(hostname: String, options: dns.LookupAllOptions): Promise<`T$34`> = definedExternally
external interface `T$35` {
    var address: String
    var family: Number
}
external fun __promisify__(hostname: String, options: Number? = definedExternally /* null */): Promise<`T$35`> = definedExternally
external fun __promisify__(hostname: String, options: dns.LookupOneOptions? = definedExternally /* null */): Promise<`T$35`> = definedExternally
external interface `T$36` {
    var address: dynamic /* String | Array<dns.LookupAddress> */
    var family: Number? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(hostname: String, options: Number? = definedExternally /* null */): Promise<`T$36`> = definedExternally
external fun __promisify__(hostname: String, options: dns.LookupOptions? = definedExternally /* null */): Promise<`T$36`> = definedExternally
external fun __promisify__(hostname: String): Promise<`T$35`> = definedExternally
external fun __promisify__(hostname: String): Promise<`T$36`> = definedExternally
