@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("e")
package e

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

external var json: dynamic /* "TypeQuery" kind unsupported yet here! (types/express.d.ts:31:14 to 31:37) */ = definedExternally
external var static: dynamic /* "TypeQuery" kind unsupported yet here! (types/express.d.ts:36:16 to 36:35) */ = definedExternally
external var urlencoded: dynamic /* "TypeQuery" kind unsupported yet here! (types/express.d.ts:42:20 to 42:49) */ = definedExternally
external fun Router(options: RouterOptions? = definedExternally /* null */): core.Router = definedExternally
external interface RouterOptions {
    var caseSensitive: Boolean? get() = definedExternally; set(value) = definedExternally
    var mergeParams: Boolean? get() = definedExternally; set(value) = definedExternally
    var strict: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface Application : core.Application
external interface CookieOptions : core.CookieOptions
external interface Errback : core.Errback
external interface ErrorRequestHandler : core.ErrorRequestHandler
external interface Express : core.Express
external interface Handler : core.Handler
external interface IRoute : core.IRoute
external interface IRouter<T> : core.IRouter
external interface IRouterHandler<T> : core.IRouterHandler<T>
external interface IRouterMatcher<T> : core.IRouterMatcher<T>
external interface MediaType : core.MediaType
external interface NextFunction : core.NextFunction
external interface Request : core.Request
external interface RequestHandler : core.RequestHandler
external interface RequestParamHandler : core.RequestParamHandler
external interface Response : core.Response
external interface Router : core.Router
external interface Send : core.Send
