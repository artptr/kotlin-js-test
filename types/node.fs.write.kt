@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("write")]
package fs.write

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

external interface `T$57`<TBuffer> {
    var bytesWritten: Number
    var buffer: TBuffer
}
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> __promisify__(fd: Number, buffer: TBuffer? = definedExternally /* null */, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Promise<`T$57`<TBuffer>> = definedExternally
external interface `T$58` {
    var bytesWritten: Number
    var buffer: String
}
external fun __promisify__(fd: Number, string: Any, position: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Promise<`T$58`> = definedExternally
