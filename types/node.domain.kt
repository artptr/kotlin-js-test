@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("domain")
package domain

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

external open class Domain : events.internal.EventEmitter, NodeJS.Domain {
    override fun run(fn: Function<*>): Unit = definedExternally
    open fun add(emitter: events.internal.EventEmitter): Unit = definedExternally
    open fun remove(emitter: events.internal.EventEmitter): Unit = definedExternally
    open fun bind(cb: (err: Error, data: Any) -> Any): Any = definedExternally
    open fun intercept(cb: (data: Any) -> Any): Any = definedExternally
    open var members: Array<Any> = definedExternally
    open fun enter(): Unit = definedExternally
    open fun exit(): Unit = definedExternally
}
external fun create(): Domain = definedExternally
