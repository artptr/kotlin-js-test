@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

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

external interface NextFunction {
    @nativeInvoke
    operator fun invoke(err: Any? = definedExternally /* null */)
}
external interface RequestHandler {
    @nativeInvoke
    operator fun invoke(req: Request, res: Response, next: NextFunction): Any
}
external interface IRouterMatcher<T> {
    @nativeInvoke
    operator fun invoke(path: String, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: RegExp, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: Array<dynamic /* String | RegExp */>, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: String, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: String, vararg handlers: (err: Any, req: Request, res: Response, next: NextFunction) -> Any): T
    @nativeInvoke
    operator fun invoke(path: String, vararg handlers: Array<dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any */>): T
    @nativeInvoke
    operator fun invoke(path: RegExp, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: RegExp, vararg handlers: (err: Any, req: Request, res: Response, next: NextFunction) -> Any): T
    @nativeInvoke
    operator fun invoke(path: RegExp, vararg handlers: Array<dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any */>): T
    @nativeInvoke
    operator fun invoke(path: Array<dynamic /* String | RegExp */>, vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(path: Array<dynamic /* String | RegExp */>, vararg handlers: (err: Any, req: Request, res: Response, next: NextFunction) -> Any): T
    @nativeInvoke
    operator fun invoke(path: Array<dynamic /* String | RegExp */>, vararg handlers: Array<dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any */>): T
}
external interface IRouterHandler<T> {
    @nativeInvoke
    operator fun invoke(vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(vararg handlers: RequestHandler): T
    @nativeInvoke
    operator fun invoke(vararg handlers: (err: Any, req: Request, res: Response, next: NextFunction) -> Any): T
    @nativeInvoke
    operator fun invoke(vararg handlers: Array<dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any */>): T
}
external interface IRouter : RequestHandler {
    fun param(name: String, handler: (req: Request, res: Response, next: NextFunction, value: Any, name: String) -> Any): IRouter /* this */
    fun param(callback: (name: String, matcher: RegExp) -> (req: Request, res: Response, next: NextFunction, value: Any, name: String) -> Any): IRouter /* this */
    var all: IRouterMatcher
    var get: IRouterMatcher
    var post: IRouterMatcher
    var put: IRouterMatcher
    var delete: IRouterMatcher
    var patch: IRouterMatcher
    var options: IRouterMatcher
    var head: IRouterMatcher
    var checkout: IRouterMatcher
    var connect: IRouterMatcher
    var copy: IRouterMatcher
    var lock: IRouterMatcher
    var merge: IRouterMatcher
    var mkactivity: IRouterMatcher
    var mkcol: IRouterMatcher
    var move: IRouterMatcher
    var notify: IRouterMatcher
    var propfind: IRouterMatcher
    var proppatch: IRouterMatcher
    var purge: IRouterMatcher
    var report: IRouterMatcher
    var search: IRouterMatcher
    var subscribe: IRouterMatcher
    var trace: IRouterMatcher
    var unlock: IRouterMatcher
    var unsubscribe: IRouterMatcher
    var use: IRouterHandler /* IRouterHandler & IRouterMatcher */
    fun route(prefix: String): IRoute
    fun route(prefix: RegExp): IRoute
    fun route(prefix: Array<dynamic /* String | RegExp */>): IRoute
    var stack: Array<Any>
}
external interface IRoute {
    var path: String
    var stack: Any
    var all: IRouterHandler
    var get: IRouterHandler
    var post: IRouterHandler
    var put: IRouterHandler
    var delete: IRouterHandler
    var patch: IRouterHandler
    var options: IRouterHandler
    var head: IRouterHandler
    var checkout: IRouterHandler
    var copy: IRouterHandler
    var lock: IRouterHandler
    var merge: IRouterHandler
    var mkactivity: IRouterHandler
    var mkcol: IRouterHandler
    var move: IRouterHandler
    var notify: IRouterHandler
    var purge: IRouterHandler
    var report: IRouterHandler
    var search: IRouterHandler
    var subscribe: IRouterHandler
    var trace: IRouterHandler
    var unlock: IRouterHandler
    var unsubscribe: IRouterHandler
}
external interface Router : IRouter
external interface CookieOptions {
    var maxAge: Number? get() = definedExternally; set(value) = definedExternally
    var signed: Boolean? get() = definedExternally; set(value) = definedExternally
    var expires: dynamic /* Boolean | Date */ get() = definedExternally; set(value) = definedExternally
    var httpOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var domain: String? get() = definedExternally; set(value) = definedExternally
    var secure: dynamic /* Boolean | String /* "auto" */ */ get() = definedExternally; set(value) = definedExternally
    var encode: ((`val`: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var sameSite: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
}
external interface ByteRange {
    var start: Number
    var end: Number
}
external interface RequestRanges : Array<ByteRange> {
    var type: String
}
external interface Request : http.IncomingMessage, global.Express.Request {
    fun get(name: String /* "set-cookie" */): Array<String>?
    fun get(name: String): String?
    fun header(name: String /* "set-cookie" */): Array<String>?
    fun header(name: String): String?
    fun accepts(): Array<String>
    fun accepts(type: String): dynamic /* String | Boolean */
    fun accepts(type: Array<String>): dynamic /* String | Boolean */
    fun accepts(vararg type: String): dynamic /* String | Boolean */
    fun acceptsCharsets(): Array<String>
    fun acceptsCharsets(charset: String): dynamic /* String | Boolean */
    fun acceptsCharsets(charset: Array<String>): dynamic /* String | Boolean */
    fun acceptsCharsets(vararg charset: String): dynamic /* String | Boolean */
    fun acceptsEncodings(): Array<String>
    fun acceptsEncodings(encoding: String): dynamic /* String | Boolean */
    fun acceptsEncodings(encoding: Array<String>): dynamic /* String | Boolean */
    fun acceptsEncodings(vararg encoding: String): dynamic /* String | Boolean */
    fun acceptsLanguages(): Array<String>
    fun acceptsLanguages(lang: String): dynamic /* String | Boolean */
    fun acceptsLanguages(lang: Array<String>): dynamic /* String | Boolean */
    fun acceptsLanguages(vararg lang: String): dynamic /* String | Boolean */
    fun range(size: Number): dynamic /* RequestRanges | Number /* -1 */ | Number /* -2 */ | Nothing? */
    var accepted: Array<MediaType>
    fun param(name: String, defaultValue: Any? = definedExternally /* null */): String
    fun `is`(type: String): dynamic /* String | Boolean */
    var protocol: String
    var secure: Boolean
    var ip: String
    var ips: Array<String>
    var subdomains: Array<String>
    var path: String
    var hostname: String
    var host: String
    var fresh: Boolean
    var stale: Boolean
    var xhr: Boolean
    var body: Any
    var cookies: Any
    var method: String
    var params: Any
    fun clearCookie(name: String, options: Any? = definedExternally /* null */): Response
    var query: Any
    var route: Any
    var signedCookies: Any
    var originalUrl: String
    var url: String
    var baseUrl: String
    var app: Application
}
external interface MediaType {
    var value: String
    var quality: Number
    var type: String
    var subtype: String
}
external interface Response : http.ServerResponse, global.Express.Response {
    fun status(code: Number): Response
    fun sendStatus(code: Number): Response
    fun links(links: Any): Response
    var send: (body: Any? /*= null*/) -> Response
    var json: (body: Any? /*= null*/) -> Response
    var jsonp: (body: Any? /*= null*/) -> Response
    fun sendFile(path: String)
    fun sendFile(path: String, options: Any)
    fun sendFile(path: String, fn: (err: Error) -> Unit)
    fun sendFile(path: String, options: Any, fn: (err: Error) -> Unit)
    fun sendfile(path: String)
    fun sendfile(path: String, options: Any)
    fun sendfile(path: String, fn: (err: Error) -> Unit)
    fun sendfile(path: String, options: Any, fn: (err: Error) -> Unit)
    fun download(path: String)
    fun download(path: String, filename: String)
    fun download(path: String, fn: (err: Error) -> Unit)
    fun download(path: String, filename: String, fn: (err: Error) -> Unit)
    fun contentType(type: String): Response
    fun type(type: String): Response
    fun format(obj: Any): Response
    fun attachment(filename: String? = definedExternally /* null */): Response
    fun set(field: Any): Response
    fun set(field: String, value: String? = definedExternally /* null */): Response
    fun header(field: Any): Response
    fun header(field: String, value: String? = definedExternally /* null */): Response
    var headersSent: Boolean
    fun get(field: String): String
    fun clearCookie(name: String, options: Any? = definedExternally /* null */): Response
    fun cookie(name: String, `val`: String, options: CookieOptions): Response
    fun cookie(name: String, `val`: Any, options: CookieOptions): Response
    fun cookie(name: String, `val`: Any): Response
    fun location(url: String): Response
    fun redirect(url: String)
    fun redirect(status: Number, url: String)
    fun redirect(url: String, status: Number)
    fun render(view: String, options: Any? = definedExternally /* null */, callback: ((err: Error, html: String) -> Unit)? = definedExternally /* null */)
    fun render(view: String, callback: ((err: Error, html: String) -> Unit)? = definedExternally /* null */)
    var locals: Any
    var charset: String
    fun vary(field: String): Response
    var app: Application
    fun append(field: String, value: String? = definedExternally /* null */): Response
    fun append(field: String, value: Array<String>? = definedExternally /* null */): Response
    fun render(view: String)
    fun append(field: String): Response
}
external interface Handler : RequestHandler
external interface Application : EventEmitter, IRouter, global.Express.Application {
    @nativeInvoke
    operator fun invoke(req: Request, res: Response): Any
    @nativeInvoke
    operator fun invoke(req: Request, res: http.ServerResponse): Any
    @nativeInvoke
    operator fun invoke(req: http.IncomingMessage, res: Response): Any
    @nativeInvoke
    operator fun invoke(req: http.IncomingMessage, res: http.ServerResponse): Any
    fun init()
    fun defaultConfiguration()
    fun engine(ext: String, fn: Function<*>): Application
    fun set(setting: String, `val`: Any): Application
    override var get: (name: String) -> Any /* (name: String) -> Any & IRouterMatcher */
    fun param(name: String, handler: (req: Request, res: Response, next: NextFunction, value: Any, name: String) -> Any): Application /* this */
    fun param(name: Array<String>, handler: (req: Request, res: Response, next: NextFunction, value: Any, name: String) -> Any): Application /* this */
    fun param(callback: (name: String, matcher: RegExp) -> (req: Request, res: Response, next: NextFunction, value: Any, name: String) -> Any): Application /* this */
    fun path(): String
    fun enabled(setting: String): Boolean
    fun disabled(setting: String): Boolean
    fun enable(setting: String): Application
    fun disable(setting: String): Application
    fun configure(fn: Function<*>): Application
    fun configure(env0: String, fn: Function<*>): Application
    fun configure(env0: String, env1: String, fn: Function<*>): Application
    fun configure(env0: String, env1: String, env2: String, fn: Function<*>): Application
    fun configure(env0: String, env1: String, env2: String, env3: String, fn: Function<*>): Application
    fun configure(env0: String, env1: String, env2: String, env3: String, env4: String, fn: Function<*>): Application
    fun render(name: String, options: Any? = definedExternally /* null */, callback: ((err: Error, html: String) -> Unit)? = definedExternally /* null */)
    fun render(name: String, callback: (err: Error, html: String) -> Unit)
    fun listen(port: Number, hostname: String, backlog: Number, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(port: Number, hostname: String, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(port: Number, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(path: String, callback: Function<*>? = definedExternally /* null */): http.Server
    fun listen(handle: Any, listeningListener: Function<*>? = definedExternally /* null */): http.Server
    var router: String
    var settings: Any
    var resource: Any
    var map: Any
    var locals: Any
    var routes: Any
    var _router: Any
    override var use: IRouterHandler /* IRouterHandler & IRouterMatcher & (handlers: dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any | Array<dynamic /* RequestHandler | (err: Any, req: Request, res: Response, next: NextFunction) -> Any */> */) -> T */
}
external interface Express : Application {
    var request: Request
    var response: Response
}
