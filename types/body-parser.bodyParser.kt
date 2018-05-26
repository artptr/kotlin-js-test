@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("bodyParser")
package bodyParser

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

external interface Options {
    var inflate: Boolean? get() = definedExternally; set(value) = definedExternally
    var limit: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var type: dynamic /* String | Array<String> | (req: http.IncomingMessage) -> Any */ get() = definedExternally; set(value) = definedExternally
    val verify: ((req: http.IncomingMessage, res: http.ServerResponse, buf: Buffer, encoding: String) -> Unit)? get() = definedExternally
}
external interface OptionsJson : Options {
    val reviver: ((key: String, value: Any) -> Any)? get() = definedExternally
    var strict: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface OptionsText : Options {
    var defaultCharset: String? get() = definedExternally; set(value) = definedExternally
}
external interface OptionsUrlencoded : Options {
    var extended: Boolean? get() = definedExternally; set(value) = definedExternally
    var parameterLimit: Number? get() = definedExternally; set(value) = definedExternally
}
external fun json(options: OptionsJson? = definedExternally /* null */): NextHandleFunction = definedExternally
external fun raw(options: Options? = definedExternally /* null */): NextHandleFunction = definedExternally
external fun text(options: OptionsText? = definedExternally /* null */): NextHandleFunction = definedExternally
external fun urlencoded(options: OptionsUrlencoded? = definedExternally /* null */): NextHandleFunction = definedExternally
