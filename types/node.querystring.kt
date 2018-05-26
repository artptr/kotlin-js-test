@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("querystring")
package querystring

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

external interface StringifyOptions {
    var encodeURIComponent: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external interface ParseOptions {
    var maxKeys: Number? get() = definedExternally; set(value) = definedExternally
    var decodeURIComponent: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external interface ParsedUrlQuery {
    @nativeGetter
    operator fun get(key: String): dynamic /* String | Array<String> | Nothing? */
    @nativeSetter
    operator fun set(key: String, value: String)
    @nativeSetter
    operator fun set(key: String, value: Array<String>)
    @nativeSetter
    operator fun set(key: String, value: Nothing?)
}
external fun <T> stringify(obj: T, sep: String? = definedExternally /* null */, eq: String? = definedExternally /* null */, options: StringifyOptions? = definedExternally /* null */): String = definedExternally
external fun parse(str: String, sep: String? = definedExternally /* null */, eq: String? = definedExternally /* null */, options: ParseOptions? = definedExternally /* null */): ParsedUrlQuery = definedExternally
external fun <T : Any> parse(str: String, sep: String? = definedExternally /* null */, eq: String? = definedExternally /* null */, options: ParseOptions? = definedExternally /* null */): T = definedExternally
external fun escape(str: String): String = definedExternally
external fun unescape(str: String): String = definedExternally
