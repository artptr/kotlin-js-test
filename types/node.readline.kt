@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("readline")
package readline

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

external interface Key {
    var sequence: String? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var ctrl: Boolean? get() = definedExternally; set(value) = definedExternally
    var meta: Boolean? get() = definedExternally; set(value) = definedExternally
    var shift: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ReadLine : events.internal.EventEmitter {
    fun setPrompt(prompt: String)
    fun prompt(preserveCursor: Boolean? = definedExternally /* null */)
    fun question(query: String, callback: (answer: String) -> Unit)
    fun pause(): ReadLine
    fun resume(): ReadLine
    fun close()
    fun write(data: String, key: Key? = definedExternally /* null */)
    fun write(data: Buffer, key: Key? = definedExternally /* null */)
    fun addListener(event: String, listener: (args: Any) -> Unit): ReadLine /* this */
    fun addListener(event: String /* "close" */, listener: () -> Unit): ReadLine /* this */
    fun addListener(event: String /* "line" */, listener: (input: Any) -> Unit): ReadLine /* this */
    fun addListener(event: String /* "pause" */, listener: () -> Unit): ReadLine /* this */
    fun addListener(event: String /* "resume" */, listener: () -> Unit): ReadLine /* this */
    fun addListener(event: String /* "SIGCONT" */, listener: () -> Unit): ReadLine /* this */
    fun addListener(event: String /* "SIGINT" */, listener: () -> Unit): ReadLine /* this */
    fun addListener(event: String /* "SIGTSTP" */, listener: () -> Unit): ReadLine /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "close" */): Boolean
    fun emit(event: String /* "line" */, input: Any): Boolean
    fun emit(event: String /* "pause" */): Boolean
    fun emit(event: String /* "resume" */): Boolean
    fun emit(event: String /* "SIGCONT" */): Boolean
    fun emit(event: String /* "SIGINT" */): Boolean
    fun emit(event: String /* "SIGTSTP" */): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): ReadLine /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): ReadLine /* this */
    fun on(event: String /* "line" */, listener: (input: Any) -> Unit): ReadLine /* this */
    fun on(event: String /* "pause" */, listener: () -> Unit): ReadLine /* this */
    fun on(event: String /* "resume" */, listener: () -> Unit): ReadLine /* this */
    fun on(event: String /* "SIGCONT" */, listener: () -> Unit): ReadLine /* this */
    fun on(event: String /* "SIGINT" */, listener: () -> Unit): ReadLine /* this */
    fun on(event: String /* "SIGTSTP" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String, listener: (args: Any) -> Unit): ReadLine /* this */
    fun once(event: String /* "close" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String /* "line" */, listener: (input: Any) -> Unit): ReadLine /* this */
    fun once(event: String /* "pause" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String /* "resume" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String /* "SIGCONT" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String /* "SIGINT" */, listener: () -> Unit): ReadLine /* this */
    fun once(event: String /* "SIGTSTP" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "close" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "line" */, listener: (input: Any) -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "pause" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "resume" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "SIGCONT" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "SIGINT" */, listener: () -> Unit): ReadLine /* this */
    fun prependListener(event: String /* "SIGTSTP" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "line" */, listener: (input: Any) -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "pause" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "resume" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "SIGCONT" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "SIGINT" */, listener: () -> Unit): ReadLine /* this */
    fun prependOnceListener(event: String /* "SIGTSTP" */, listener: () -> Unit): ReadLine /* this */
}
external interface ReadLineOptions {
    var input: NodeJS.ReadableStream
    var output: NodeJS.WritableStream? get() = definedExternally; set(value) = definedExternally
    var completer: dynamic /* (line: String) -> dynamic /* JsTuple<Array<String>, String> */ | (line: String, callback: (err: Any, result: dynamic /* JsTuple<Array<String>, String> */) -> Unit) -> Any */ get() = definedExternally; set(value) = definedExternally
    var terminal: Boolean? get() = definedExternally; set(value) = definedExternally
    var historySize: Number? get() = definedExternally; set(value) = definedExternally
}
external fun createInterface(input: NodeJS.ReadableStream, output: NodeJS.WritableStream? = definedExternally /* null */, completer: ((line: String) -> dynamic /* JsTuple<Array<String>, String> */)? = definedExternally /* null */, terminal: Boolean? = definedExternally /* null */): ReadLine = definedExternally
external fun createInterface(input: NodeJS.ReadableStream, output: NodeJS.WritableStream? = definedExternally /* null */, completer: ((line: String, callback: (err: Any, result: dynamic /* JsTuple<Array<String>, String> */) -> Unit) -> Any)? = definedExternally /* null */, terminal: Boolean? = definedExternally /* null */): ReadLine = definedExternally
external fun createInterface(options: ReadLineOptions): ReadLine = definedExternally
external fun cursorTo(stream: NodeJS.WritableStream, x: Number, y: Number? = definedExternally /* null */): Unit = definedExternally
external fun emitKeypressEvents(stream: NodeJS.ReadableStream, `interface`: ReadLine? = definedExternally /* null */): Unit = definedExternally
external fun moveCursor(stream: NodeJS.WritableStream, dx: String, dy: String): Unit = definedExternally
external fun moveCursor(stream: NodeJS.WritableStream, dx: String, dy: Number): Unit = definedExternally
external fun moveCursor(stream: NodeJS.WritableStream, dx: Number, dy: String): Unit = definedExternally
external fun moveCursor(stream: NodeJS.WritableStream, dx: Number, dy: Number): Unit = definedExternally
external fun clearLine(stream: NodeJS.WritableStream, dir: Number): Unit = definedExternally
external fun clearScreenDown(stream: NodeJS.WritableStream): Unit = definedExternally
external fun createInterface(input: NodeJS.ReadableStream): ReadLine = definedExternally
