@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("readFile")]
package fs.readFile

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

external interface `T$63` {
    var encoding: Nothing? get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: `T$63`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun __promisify__(path: Number, options: `T$63`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun __promisify__(path: Buffer, options: `T$63`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun __promisify__(path: url.URL, options: `T$63`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external interface `T$64` {
    var encoding: String
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: String): Promise<String> = definedExternally
external fun __promisify__(path: String, options: `T$64`): Promise<String> = definedExternally
external fun __promisify__(path: Number, options: String): Promise<String> = definedExternally
external fun __promisify__(path: Number, options: `T$64`): Promise<String> = definedExternally
external fun __promisify__(path: Buffer, options: String): Promise<String> = definedExternally
external fun __promisify__(path: Buffer, options: `T$64`): Promise<String> = definedExternally
external fun __promisify__(path: url.URL, options: String): Promise<String> = definedExternally
external fun __promisify__(path: url.URL, options: `T$64`): Promise<String> = definedExternally
external interface `T$65` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: dynamic /* String? | `T$65`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Number, options: dynamic /* String? | `T$65`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: dynamic /* String? | `T$65`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: dynamic /* String? | `T$65`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
