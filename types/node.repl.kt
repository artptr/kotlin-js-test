@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("repl")
package repl

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

external interface ReplOptions {
    var prompt: String? get() = definedExternally; set(value) = definedExternally
    var input: NodeJS.ReadableStream? get() = definedExternally; set(value) = definedExternally
    var output: NodeJS.WritableStream? get() = definedExternally; set(value) = definedExternally
    var terminal: Boolean? get() = definedExternally; set(value) = definedExternally
    var eval: Function<*>? get() = definedExternally; set(value) = definedExternally
    var useColors: Boolean? get() = definedExternally; set(value) = definedExternally
    var useGlobal: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreUndefined: Boolean? get() = definedExternally; set(value) = definedExternally
    var writer: Function<*>? get() = definedExternally; set(value) = definedExternally
    var completer: Function<*>? get() = definedExternally; set(value) = definedExternally
    var replMode: Any? get() = definedExternally; set(value) = definedExternally
    var breakEvalOnSigint: Any? get() = definedExternally; set(value) = definedExternally
}
external interface `T$18` {
    var help: String
    var action: Function<*>
}
external interface REPLServer : readline.ReadLine {
    var context: Any
    var inputStream: NodeJS.ReadableStream
    var outputStream: NodeJS.WritableStream
    fun defineCommand(keyword: String, cmd: Function<*>)
    fun defineCommand(keyword: String, cmd: `T$18`)
    fun displayPrompt(preserveCursor: Boolean? = definedExternally /* null */)
    fun addListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    fun addListener(event: String /* "exit" */, listener: () -> Unit): REPLServer /* this */
    fun addListener(event: String /* "reset" */, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "exit" */): Boolean
    fun emit(event: String /* "reset" */, context: Any): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    fun on(event: String /* "exit" */, listener: () -> Unit): REPLServer /* this */
    fun on(event: String /* "reset" */, listener: (args: Any) -> Unit): REPLServer /* this */
    fun once(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    fun once(event: String /* "exit" */, listener: () -> Unit): REPLServer /* this */
    fun once(event: String /* "reset" */, listener: (args: Any) -> Unit): REPLServer /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    fun prependListener(event: String /* "exit" */, listener: () -> Unit): REPLServer /* this */
    fun prependListener(event: String /* "reset" */, listener: (args: Any) -> Unit): REPLServer /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    fun prependOnceListener(event: String /* "exit" */, listener: () -> Unit): REPLServer /* this */
    fun prependOnceListener(event: String /* "reset" */, listener: (args: Any) -> Unit): REPLServer /* this */
}
external fun start(options: String? = definedExternally /* null */): REPLServer = definedExternally
external fun start(options: ReplOptions? = definedExternally /* null */): REPLServer = definedExternally
external open class Recoverable(err: Error) : SyntaxError {
    open var err: Error = definedExternally
}
external fun start(): REPLServer = definedExternally
