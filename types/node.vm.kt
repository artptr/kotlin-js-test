@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("vm")
package vm

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

external interface Context
external interface ScriptOptions {
    var filename: String? get() = definedExternally; set(value) = definedExternally
    var lineOffset: Number? get() = definedExternally; set(value) = definedExternally
    var columnOffset: Number? get() = definedExternally; set(value) = definedExternally
    var displayErrors: Boolean? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var cachedData: Buffer? get() = definedExternally; set(value) = definedExternally
    var produceCachedData: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface RunningScriptOptions {
    var filename: String? get() = definedExternally; set(value) = definedExternally
    var lineOffset: Number? get() = definedExternally; set(value) = definedExternally
    var columnOffset: Number? get() = definedExternally; set(value) = definedExternally
    var displayErrors: Boolean? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Script(code: String, options: ScriptOptions? = definedExternally /* null */) {
    open fun runInContext(contextifiedSandbox: Context, options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
    open fun runInNewContext(sandbox: Context? = definedExternally /* null */, options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
    open fun runInThisContext(options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
}
external fun createContext(sandbox: Context? = definedExternally /* null */): Context = definedExternally
external fun isContext(sandbox: Context): Boolean = definedExternally
external fun runInContext(code: String, contextifiedSandbox: Context, options: String? = definedExternally /* null */): Any = definedExternally
external fun runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
external fun runInDebugContext(code: String): Any = definedExternally
external fun runInNewContext(code: String, sandbox: Context? = definedExternally /* null */, options: String? = definedExternally /* null */): Any = definedExternally
external fun runInNewContext(code: String, sandbox: Context? = definedExternally /* null */, options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
external fun runInThisContext(code: String, options: String? = definedExternally /* null */): Any = definedExternally
external fun runInThisContext(code: String, options: RunningScriptOptions? = definedExternally /* null */): Any = definedExternally
external fun runInContext(code: String, contextifiedSandbox: Context): Any = definedExternally
external fun runInNewContext(code: String): Any = definedExternally
external fun runInThisContext(code: String): Any = definedExternally
