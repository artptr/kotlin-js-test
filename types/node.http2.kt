@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("http2")
package http2

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

external interface IncomingHttpHeaders : http.IncomingHttpHeaders
external interface StreamPriorityOptions {
    var exclusive: Boolean? get() = definedExternally; set(value) = definedExternally
    var parent: Number? get() = definedExternally; set(value) = definedExternally
    var weight: Number? get() = definedExternally; set(value) = definedExternally
    var silent: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface StreamState {
    var localWindowSize: Number? get() = definedExternally; set(value) = definedExternally
    var state: Number? get() = definedExternally; set(value) = definedExternally
    var streamLocalClose: Number? get() = definedExternally; set(value) = definedExternally
    var streamRemoteClose: Number? get() = definedExternally; set(value) = definedExternally
    var sumDependencyWeight: Number? get() = definedExternally; set(value) = definedExternally
    var weight: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ServerStreamResponseOptions {
    var endStream: Boolean? get() = definedExternally; set(value) = definedExternally
    var getTrailers: ((trailers: http.OutgoingHttpHeaders) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface StatOptions {
    var offset: Number
    var length: Number
}
external interface ServerStreamFileResponseOptions {
    var statCheck: ((stats: fs.Stats, headers: http.OutgoingHttpHeaders, statOptions: StatOptions) -> dynamic /* Boolean | Unit */)? get() = definedExternally; set(value) = definedExternally
    var getTrailers: ((trailers: http.OutgoingHttpHeaders) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var length: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ServerStreamFileResponseOptionsWithError : ServerStreamFileResponseOptions {
    var onError: ((err: NodeJS.ErrnoException) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface Http2Stream : stream.internal.Duplex {
    var aborted: Boolean
    fun close(code: Number, callback: (() -> Unit)? = definedExternally /* null */)
    var closed: Boolean
    var destroyed: Boolean
    var pending: Boolean
    fun priority(options: StreamPriorityOptions)
    var rstCode: Number
    var session: Http2Session
    fun setTimeout(msecs: Number, callback: (() -> Unit)? = definedExternally /* null */)
    var state: StreamState
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "aborted" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "close" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "drain" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "end" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "finish" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "pipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "unpipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "aborted" */): Boolean
    override fun emit(event: String /* "close" */): Boolean
    override fun emit(event: String /* "data" */, chunk: String): Boolean
    override fun emit(event: String /* "data" */, chunk: Buffer): Boolean
    fun emit(event: String /* "drain" */): Boolean
    override fun emit(event: String /* "end" */): Boolean
    override fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: String /* "finish" */): Boolean
    fun emit(event: String /* "frameError" */, frameType: Number, errorCode: Number): Boolean
    override fun emit(event: String /* "pipe" */, src: stream.internal.Readable): Boolean
    override fun emit(event: String /* "unpipe" */, src: stream.internal.Readable): Boolean
    fun emit(event: String /* "streamClosed" */, code: Number): Boolean
    fun emit(event: String /* "timeout" */): Boolean
    fun emit(event: String /* "trailers" */, trailers: IncomingHttpHeaders, flags: Number): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    fun on(event: String /* "aborted" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Http2Stream /* this */
    fun on(event: String /* "drain" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "end" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun on(event: String /* "finish" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun on(event: String /* "pipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun on(event: String /* "unpipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun on(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun on(event: String /* "timeout" */, listener: () -> Unit): Http2Stream /* this */
    fun on(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    fun once(event: String /* "aborted" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "close" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Http2Stream /* this */
    fun once(event: String /* "drain" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "end" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun once(event: String /* "finish" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun once(event: String /* "pipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun once(event: String /* "unpipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun once(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun once(event: String /* "timeout" */, listener: () -> Unit): Http2Stream /* this */
    fun once(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "aborted" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "close" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "drain" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "end" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "finish" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "pipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "unpipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "aborted" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "data" */, listener: (chunk: dynamic /* String | Buffer */) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "drain" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "end" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "finish" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "pipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "unpipe" */, listener: (src: stream.internal.Readable) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
}
external interface ClientHttp2Stream : Http2Stream {
    fun addListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun addListener(event: String /* "headers" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun addListener(event: String /* "push" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun addListener(event: String /* "response" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "headers" */, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun emit(event: String /* "push" */, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun emit(event: String /* "response" */, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun on(event: String /* "headers" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun on(event: String /* "push" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun on(event: String /* "response" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun once(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun once(event: String /* "headers" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun once(event: String /* "push" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun once(event: String /* "response" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun prependListener(event: String /* "headers" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependListener(event: String /* "push" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependListener(event: String /* "response" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun prependOnceListener(event: String /* "headers" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependOnceListener(event: String /* "push" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
    fun prependOnceListener(event: String /* "response" */, listener: (headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Stream /* this */
}
external interface ServerHttp2Stream : Http2Stream {
    fun additionalHeaders(headers: http.OutgoingHttpHeaders)
    var headersSent: Boolean
    var pushAllowed: Boolean
    fun pushStream(headers: http.OutgoingHttpHeaders, callback: ((err: Error?, pushStream: ServerHttp2Stream, headers: http.OutgoingHttpHeaders) -> Unit)? = definedExternally /* null */)
    fun pushStream(headers: http.OutgoingHttpHeaders, options: StreamPriorityOptions? = definedExternally /* null */, callback: ((err: Error?, pushStream: ServerHttp2Stream, headers: http.OutgoingHttpHeaders) -> Unit)? = definedExternally /* null */)
    fun respond(headers: http.OutgoingHttpHeaders? = definedExternally /* null */, options: ServerStreamResponseOptions? = definedExternally /* null */)
    fun respondWithFD(fd: Number, headers: http.OutgoingHttpHeaders? = definedExternally /* null */, options: ServerStreamFileResponseOptions? = definedExternally /* null */)
    fun respondWithFile(path: String, headers: http.OutgoingHttpHeaders? = definedExternally /* null */, options: ServerStreamFileResponseOptionsWithError? = definedExternally /* null */)
    fun pushStream(headers: http.OutgoingHttpHeaders)
}
external interface Settings {
    var headerTableSize: Number? get() = definedExternally; set(value) = definedExternally
    var enablePush: Boolean? get() = definedExternally; set(value) = definedExternally
    var initialWindowSize: Number? get() = definedExternally; set(value) = definedExternally
    var maxFrameSize: Number? get() = definedExternally; set(value) = definedExternally
    var maxConcurrentStreams: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeaderListSize: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ClientSessionRequestOptions {
    var endStream: Boolean? get() = definedExternally; set(value) = definedExternally
    var exclusive: Boolean? get() = definedExternally; set(value) = definedExternally
    var parent: Number? get() = definedExternally; set(value) = definedExternally
    var weight: Number? get() = definedExternally; set(value) = definedExternally
    var getTrailers: ((trailers: http.OutgoingHttpHeaders, flags: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface SessionState {
    var effectiveLocalWindowSize: Number? get() = definedExternally; set(value) = definedExternally
    var effectiveRecvDataLength: Number? get() = definedExternally; set(value) = definedExternally
    var nextStreamID: Number? get() = definedExternally; set(value) = definedExternally
    var localWindowSize: Number? get() = definedExternally; set(value) = definedExternally
    var lastProcStreamID: Number? get() = definedExternally; set(value) = definedExternally
    var remoteWindowSize: Number? get() = definedExternally; set(value) = definedExternally
    var outboundQueueSize: Number? get() = definedExternally; set(value) = definedExternally
    var deflateDynamicTableSize: Number? get() = definedExternally; set(value) = definedExternally
    var inflateDynamicTableSize: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Http2Session : events.internal.EventEmitter {
    var alpnProtocol: String? get() = definedExternally; set(value) = definedExternally
    fun close(callback: (() -> Unit)? = definedExternally /* null */)
    var closed: Boolean
    fun destroy(error: Error? = definedExternally /* null */, code: Number? = definedExternally /* null */)
    var destroyed: Boolean
    var encrypted: Boolean? get() = definedExternally; set(value) = definedExternally
    fun goaway(code: Number? = definedExternally /* null */, lastStreamID: Number? = definedExternally /* null */, opaqueData: Buffer? = definedExternally /* null */)
    fun goaway(code: Number? = definedExternally /* null */, lastStreamID: Number? = definedExternally /* null */, opaqueData: DataView? = definedExternally /* null */)
    var localSettings: Settings
    var originSet: Array<String>? get() = definedExternally; set(value) = definedExternally
    var pendingSettingsAck: Boolean
    fun ref()
    var remoteSettings: Settings
    fun rstStream(stream: Http2Stream, code: Number? = definedExternally /* null */)
    fun setTimeout(msecs: Number, callback: (() -> Unit)? = definedExternally /* null */)
    var socket: dynamic /* net.Socket | tls.TLSSocket */
    var state: SessionState
    fun priority(stream: Http2Stream, options: StreamPriorityOptions)
    fun settings(settings: Settings)
    var type: Number
    fun unref()
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "close" */, listener: () -> Unit): Http2Session /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "localSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2Session /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "close" */): Boolean
    fun emit(event: String /* "error" */, err: Error): Boolean
    fun emit(event: String /* "frameError" */, frameType: Number, errorCode: Number, streamID: Number): Boolean
    fun emit(event: String /* "goaway" */, errorCode: Number, lastStreamID: Number, opaqueData: Buffer): Boolean
    fun emit(event: String /* "localSettings" */, settings: Settings): Boolean
    fun emit(event: String /* "remoteSettings" */, settings: Settings): Boolean
    fun emit(event: String /* "timeout" */): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): Http2Session /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun on(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun on(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun on(event: String /* "localSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun on(event: String /* "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun on(event: String /* "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    fun once(event: String /* "close" */, listener: () -> Unit): Http2Session /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun once(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun once(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun once(event: String /* "localSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun once(event: String /* "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun once(event: String /* "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "close" */, listener: () -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "localSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "localSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun goaway()
}
external interface ClientHttp2Session : Http2Session {
    fun request(headers: http.OutgoingHttpHeaders? = definedExternally /* null */, options: ClientSessionRequestOptions? = definedExternally /* null */): ClientHttp2Stream
    fun addListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "altsvc" */, alt: String, origin: String, stream: Number): Boolean
    fun emit(event: String /* "connect" */, session: ClientHttp2Session, socket: net.Socket): Boolean
    fun emit(event: String /* "connect" */, session: ClientHttp2Session, socket: tls.TLSSocket): Boolean
    fun emit(event: String /* "stream" */, stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Session /* this */
    fun once(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ClientHttp2Session /* this */
}
external interface AlternativeServiceOptions {
    var origin: dynamic /* String | Number | url.URL */
}
external interface ServerHttp2Session : Http2Session {
    fun altsvc(alt: String, originOrStream: String)
    fun altsvc(alt: String, originOrStream: Number)
    fun altsvc(alt: String, originOrStream: url.URL)
    fun altsvc(alt: String, originOrStream: AlternativeServiceOptions)
    var server: dynamic /* Http2Server | Http2SecureServer */
    fun addListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun addListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "connect" */, session: ServerHttp2Session, socket: net.Socket): Boolean
    fun emit(event: String /* "connect" */, session: ServerHttp2Session, socket: tls.TLSSocket): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun on(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    fun once(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun once(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun prependListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun prependOnceListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
}
external interface SessionOptions {
    var maxDeflateDynamicTableSize: Number? get() = definedExternally; set(value) = definedExternally
    var maxReservedRemoteStreams: Number? get() = definedExternally; set(value) = definedExternally
    var maxSendHeaderBlockLength: Number? get() = definedExternally; set(value) = definedExternally
    var paddingStrategy: Number? get() = definedExternally; set(value) = definedExternally
    var peerMaxConcurrentStreams: Number? get() = definedExternally; set(value) = definedExternally
    var selectPadding: ((frameLen: Number, maxFrameLen: Number) -> Number)? get() = definedExternally; set(value) = definedExternally
    var settings: Settings? get() = definedExternally; set(value) = definedExternally
}
external interface SecureClientSessionOptions : SessionOptions, tls.ConnectionOptions
external interface SecureServerSessionOptions : SessionOptions, tls.TlsOptions
external interface ServerOptions : SessionOptions {
    var allowHTTP1: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SecureServerOptions : SecureServerSessionOptions {
    var allowHTTP1: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface Http2Server : net.Server {
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "checkContinue" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "request" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "sessionError" */, err: Error): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun emit(event: String /* "timeout" */): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    fun on(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun on(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun on(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    fun on(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    fun once(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun once(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun once(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    fun once(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
}
external interface Http2SecureServer : tls.Server {
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "unknownProtocol" */, listener: (socket: tls.TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "checkContinue" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "request" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "sessionError" */, err: Error): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    fun emit(event: String /* "timeout" */): Boolean
    fun emit(event: String /* "unknownProtocol" */, socket: tls.TLSSocket): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "unknownProtocol" */, listener: (socket: tls.TLSSocket) -> Unit): Http2SecureServer /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "unknownProtocol" */, listener: (socket: tls.TLSSocket) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "unknownProtocol" */, listener: (socket: tls.TLSSocket) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "checkContinue" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "unknownProtocol" */, listener: (socket: tls.TLSSocket) -> Unit): Http2SecureServer /* this */
}
external interface Http2ServerRequest : stream.internal.Readable {
    var headers: IncomingHttpHeaders
    var httpVersion: String
    var method: String
    var rawHeaders: Array<String>
    var rawTrailers: Array<String>
    fun setTimeout(msecs: Number, callback: (() -> Unit)? = definedExternally /* null */)
    var socket: dynamic /* net.Socket | tls.TLSSocket */
    var stream: ServerHttp2Stream
    var trailers: IncomingHttpHeaders
    var url: String
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    fun addListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "aborted" */, hadError: Boolean, code: Number): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    fun on(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    fun once(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    fun prependListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    fun prependOnceListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
}
external interface Http2ServerResponse : events.internal.EventEmitter {
    fun addTrailers(trailers: http.OutgoingHttpHeaders)
    var connection: dynamic /* net.Socket | tls.TLSSocket */
    fun end(callback: (() -> Unit)? = definedExternally /* null */)
    fun end(data: String? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    fun end(data: Buffer? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    fun end(data: String? = definedExternally /* null */, encoding: String? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    fun end(data: Buffer? = definedExternally /* null */, encoding: String? = definedExternally /* null */, callback: (() -> Unit)? = definedExternally /* null */)
    var finished: Boolean
    fun getHeader(name: String): String
    fun getHeaderNames(): Array<String>
    fun getHeaders(): http.OutgoingHttpHeaders
    fun hasHeader(name: String): Boolean
    var headersSent: Boolean
    fun removeHeader(name: String)
    var sendDate: Boolean
    fun setHeader(name: String, value: String)
    fun setHeader(name: String, value: Number)
    fun setHeader(name: String, value: Array<String>)
    fun setHeader(name: String, value: Nothing?)
    fun setTimeout(msecs: Number, callback: (() -> Unit)? = definedExternally /* null */)
    var socket: dynamic /* net.Socket | tls.TLSSocket */
    var statusCode: Number
    var statusMessage: String /* "" */
    var stream: ServerHttp2Stream
    fun write(chunk: String, callback: ((err: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun write(chunk: Buffer, callback: ((err: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun write(chunk: String, encoding: String? = definedExternally /* null */, callback: ((err: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun write(chunk: Buffer, encoding: String? = definedExternally /* null */, callback: ((err: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun writeContinue()
    fun writeHead(statusCode: Number, headers: http.OutgoingHttpHeaders? = definedExternally /* null */)
    fun writeHead(statusCode: Number, statusMessage: String? = definedExternally /* null */, headers: http.OutgoingHttpHeaders? = definedExternally /* null */)
    fun createPushResponse(headers: http.OutgoingHttpHeaders, callback: (err: Error?, res: Http2ServerResponse) -> Unit)
    fun addListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    fun addListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerResponse /* this */
    fun addListener(event: String /* "close" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun addListener(event: String /* "drain" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    fun addListener(event: String /* "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "aborted" */, hadError: Boolean, code: Number): Boolean
    fun emit(event: String /* "close" */): Boolean
    fun emit(event: String /* "drain" */): Boolean
    fun emit(event: String /* "error" */, error: Error): Boolean
    fun emit(event: String /* "finish" */): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    fun on(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerResponse /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun on(event: String /* "drain" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun on(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    fun on(event: String /* "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    fun once(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerResponse /* this */
    fun once(event: String /* "close" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun once(event: String /* "drain" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun once(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    fun once(event: String /* "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String /* "close" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String /* "drain" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    fun prependListener(event: String /* "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String /* "drain" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    fun prependOnceListener(event: String /* "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    fun end()
    fun write(chunk: String): Boolean
    fun write(chunk: Buffer): Boolean
    fun writeHead(statusCode: Number)
}
external fun getDefaultSettings(): Settings = definedExternally
external fun getPackedSettings(settings: Settings): Settings = definedExternally
external fun getUnpackedSettings(buf: Buffer): Settings = definedExternally
external fun getUnpackedSettings(buf: Uint8Array): Settings = definedExternally
external fun createServer(onRequestHandler: ((request: Http2ServerRequest, response: Http2ServerResponse) -> Unit)? = definedExternally /* null */): Http2Server = definedExternally
external fun createServer(options: ServerOptions, onRequestHandler: ((request: Http2ServerRequest, response: Http2ServerResponse) -> Unit)? = definedExternally /* null */): Http2Server = definedExternally
external fun createSecureServer(onRequestHandler: ((request: Http2ServerRequest, response: Http2ServerResponse) -> Unit)? = definedExternally /* null */): Http2SecureServer = definedExternally
external fun createSecureServer(options: SecureServerOptions, onRequestHandler: ((request: Http2ServerRequest, response: Http2ServerResponse) -> Unit)? = definedExternally /* null */): Http2SecureServer = definedExternally
external fun connect(authority: String, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: url.URL, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: String, options: SessionOptions? = definedExternally /* null */, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: String, options: SecureClientSessionOptions? = definedExternally /* null */, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: url.URL, options: SessionOptions? = definedExternally /* null */, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: url.URL, options: SecureClientSessionOptions? = definedExternally /* null */, listener: ((session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit)? = definedExternally /* null */): ClientHttp2Session = definedExternally
external fun connect(authority: String): ClientHttp2Session = definedExternally
external fun connect(authority: url.URL): ClientHttp2Session = definedExternally
