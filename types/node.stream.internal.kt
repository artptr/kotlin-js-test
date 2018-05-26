@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("stream")
package stream.internal

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

external open class Stream : internal
external interface ReadableOptions {
    var highWaterMark: Number? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var objectMode: Boolean? get() = definedExternally; set(value) = definedExternally
    var read: ((`this`: Readable, size: Number? /*= null*/) -> Any)? get() = definedExternally; set(value) = definedExternally
    var destroy: ((error: Error? /*= null*/) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external open class Readable(opts: ReadableOptions? = definedExternally /* null */) : Stream, NodeJS.ReadableStream {
    override var readable: Boolean = definedExternally
    open var readableHighWaterMark: Number = definedExternally
    open var readableLength: Number = definedExternally
    open fun _read(size: Number): Unit = definedExternally
    override fun read(size: Number?): Any = definedExternally
    override fun setEncoding(encoding: String): Readable /* this */ = definedExternally
    override fun pause(): Readable /* this */ = definedExternally
    override fun resume(): Readable /* this */ = definedExternally
    override fun isPaused(): Boolean = definedExternally
    open fun <T : NodeJS.WritableStream> unpipe(destination: T? = definedExternally /* null */): Readable /* this */ = definedExternally
    open fun unshift(chunk: Any): Unit = definedExternally
    override fun wrap(oldStream: NodeJS.ReadableStream): Readable /* this */ = definedExternally
    open fun push(chunk: Any, encoding: String? = definedExternally /* null */): Boolean = definedExternally
    open fun _destroy(err: Error, callback: Function<*>): Unit = definedExternally
    open fun destroy(error: Error? = definedExternally /* null */): Unit = definedExternally
    open fun addListener(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun addListener(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun addListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun addListener(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun addListener(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
    override fun emit(event: String, vararg args: Any): Boolean = definedExternally
    override fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
    open fun emit(event: String /* "close" */): Boolean = definedExternally
    open fun emit(event: String /* "data" */, chunk: String): Boolean = definedExternally
    open fun emit(event: String /* "data" */, chunk: Buffer): Boolean = definedExternally
    open fun emit(event: String /* "end" */): Boolean = definedExternally
    open fun emit(event: String /* "readable" */): Boolean = definedExternally
    open fun emit(event: String /* "error" */, err: Error): Boolean = definedExternally
    open fun on(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun on(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun on(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun on(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun on(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String, listener: (args: Any) -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String /* "close" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String /* "end" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String /* "readable" */, listener: () -> Unit): Readable /* this */ = definedExternally
    open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */ = definedExternally
}
external interface `T$91` {
    var chunk: Any
    var encoding: String
}
external interface WritableOptions {
    var highWaterMark: Number? get() = definedExternally; set(value) = definedExternally
    var decodeStrings: Boolean? get() = definedExternally; set(value) = definedExternally
    var objectMode: Boolean? get() = definedExternally; set(value) = definedExternally
    var write: ((chunk: Any, encoding: String, callback: Function<*>) -> Any)? get() = definedExternally; set(value) = definedExternally
    var writev: ((chunks: Array<`T$91`>, callback: Function<*>) -> Any)? get() = definedExternally; set(value) = definedExternally
    var destroy: ((error: Error? /*= null*/) -> Any)? get() = definedExternally; set(value) = definedExternally
    var final: ((callback: (error: Error? /*= null*/) -> Unit) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external open class Writable(opts: WritableOptions? = definedExternally /* null */) : Stream, NodeJS.WritableStream {
    override var writable: Boolean = definedExternally
    open var writableHighWaterMark: Number = definedExternally
    open var writableLength: Number = definedExternally
    open fun _write(chunk: Any, encoding: String, callback: (err: Error? /*= null*/) -> Unit): Unit = definedExternally
    open fun _writev(chunks: Array<`T$91`>, callback: (err: Error? /*= null*/) -> Unit): Unit = definedExternally
    open fun _destroy(err: Error, callback: Function<*>): Unit = definedExternally
    open fun _final(callback: Function<*>): Unit = definedExternally
    open fun write(chunk: Any, cb: Function<*>? = definedExternally /* null */): Boolean = definedExternally
    open fun write(chunk: Any, encoding: String? = definedExternally /* null */, cb: Function<*>? = definedExternally /* null */): Boolean = definedExternally
    open fun setDefaultEncoding(encoding: String): Writable /* this */ = definedExternally
    override fun end(cb: Function<*>?): Unit = definedExternally
    open fun end(chunk: Any, cb: Function<*>? = definedExternally /* null */): Unit = definedExternally
    open fun end(chunk: Any, encoding: String? = definedExternally /* null */, cb: Function<*>? = definedExternally /* null */): Unit = definedExternally
    open fun cork(): Unit = definedExternally
    open fun uncork(): Unit = definedExternally
    open fun destroy(error: Error? = definedExternally /* null */): Unit = definedExternally
    open fun addListener(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun addListener(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    override fun emit(event: String, vararg args: Any): Boolean = definedExternally
    override fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
    open fun emit(event: String /* "close" */): Boolean = definedExternally
    open fun emit(event: String /* "drain" */, chunk: String): Boolean = definedExternally
    open fun emit(event: String /* "drain" */, chunk: Buffer): Boolean = definedExternally
    open fun emit(event: String /* "error" */, err: Error): Boolean = definedExternally
    open fun emit(event: String /* "finish" */): Boolean = definedExternally
    open fun emit(event: String /* "pipe" */, src: Readable): Boolean = definedExternally
    open fun emit(event: String /* "unpipe" */, src: Readable): Boolean = definedExternally
    open fun on(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun on(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun once(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun prependListener(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String, listener: (args: Any) -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "close" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "drain" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "finish" */, listener: () -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "pipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun removeListener(event: String /* "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */ = definedExternally
    open fun write(chunk: Any): Boolean = definedExternally
    open fun end(chunk: Any): Unit = definedExternally
}
external interface DuplexOptions : ReadableOptions, WritableOptions {
    var allowHalfOpen: Boolean? get() = definedExternally; set(value) = definedExternally
    var readableObjectMode: Boolean? get() = definedExternally; set(value) = definedExternally
    var writableObjectMode: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Duplex(opts: DuplexOptions? = definedExternally /* null */) : Readable, Writable {
    override var writable: Boolean = definedExternally
    override var writableHighWaterMark: Number = definedExternally
    override var writableLength: Number = definedExternally
    open fun _write(chunk: Any, encoding: String, callback: (err: Error? /*= null*/) -> Unit): Unit = definedExternally
    open fun _writev(chunks: Array<`T$91`>, callback: (err: Error? /*= null*/) -> Unit): Unit = definedExternally
    override fun _destroy(err: Error, callback: Function<*>): Unit = definedExternally
    override fun _final(callback: Function<*>): Unit = definedExternally
    override fun write(chunk: Any, cb: Function<*>?): Boolean = definedExternally
    override fun write(chunk: Any, encoding: String?, cb: Function<*>?): Boolean = definedExternally
    override fun setDefaultEncoding(encoding: String): Duplex /* this */ = definedExternally
    override fun end(cb: Function<*>?): Unit = definedExternally
    override fun end(chunk: Any, cb: Function<*>?): Unit = definedExternally
    override fun end(chunk: Any, encoding: String?, cb: Function<*>?): Unit = definedExternally
    override fun cork(): Unit = definedExternally
    override fun uncork(): Unit = definedExternally
    override fun write(chunk: Any): Boolean = definedExternally
    override fun end(chunk: Any): Unit = definedExternally
}
external interface TransformOptions : DuplexOptions {
    var transform: ((chunk: Any, encoding: String, callback: (err: Error? /*= null*/, data: Any? /*= null*/) -> Unit) -> Any)? get() = definedExternally; set(value) = definedExternally
    var flush: ((callback: (err: Error? /*= null*/, data: Any? /*= null*/) -> Unit) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external open class Transform(opts: TransformOptions? = definedExternally /* null */) : Duplex {
    open fun _transform(chunk: Any, encoding: String, callback: (err: Error? /*= null*/, data: Any? /*= null*/) -> Unit): Unit = definedExternally
    override fun destroy(error: Error?): Unit = definedExternally
}
external open class PassThrough : Transform
external fun <T : NodeJS.WritableStream> pipeline(stream1: NodeJS.ReadableStream, stream2: T, callback: ((err: NodeJS.ErrnoException) -> Unit)? = definedExternally /* null */): T = definedExternally
external fun <T : NodeJS.WritableStream> pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, stream3: T, callback: ((err: NodeJS.ErrnoException) -> Unit)? = definedExternally /* null */): T = definedExternally
external fun <T : NodeJS.WritableStream> pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, stream3: NodeJS.ReadWriteStream, stream4: T, callback: ((err: NodeJS.ErrnoException) -> Unit)? = definedExternally /* null */): T = definedExternally
external fun <T : NodeJS.WritableStream> pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, stream3: NodeJS.ReadWriteStream, stream4: NodeJS.ReadWriteStream, stream5: T, callback: ((err: NodeJS.ErrnoException) -> Unit)? = definedExternally /* null */): T = definedExternally
external fun pipeline(streams: Array<dynamic /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */>, callback: ((err: NodeJS.ErrnoException) -> Unit)? = definedExternally /* null */): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.WritableStream, vararg streams: NodeJS.WritableStream): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.WritableStream, vararg streams: NodeJS.ReadWriteStream): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.WritableStream, vararg streams: (err: NodeJS.ErrnoException) -> Unit): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, vararg streams: NodeJS.WritableStream): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, vararg streams: NodeJS.ReadWriteStream): NodeJS.WritableStream = definedExternally
external fun pipeline(stream1: NodeJS.ReadableStream, stream2: NodeJS.ReadWriteStream, vararg streams: (err: NodeJS.ErrnoException) -> Unit): NodeJS.WritableStream = definedExternally
