@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("cluster")
package cluster

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

external interface ClusterSettings {
    var execArgv: Array<String>? get() = definedExternally; set(value) = definedExternally
    var exec: String? get() = definedExternally; set(value) = definedExternally
    var args: Array<String>? get() = definedExternally; set(value) = definedExternally
    var silent: Boolean? get() = definedExternally; set(value) = definedExternally
    var stdio: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var inspectPort: dynamic /* Number | () -> Number */ get() = definedExternally; set(value) = definedExternally
}
external interface Address {
    var address: String
    var port: Number
    var addressType: dynamic /* Number | String /* "udp4" */ | String /* "udp6" */ */
}
external open class Worker : events.internal.EventEmitter {
    open var id: Number = definedExternally
    open var process: child_process.ChildProcess = definedExternally
    open var suicide: Boolean = definedExternally
    open fun send(message: Any, sendHandle: Any? = definedExternally /* null */, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean = definedExternally
    open fun kill(signal: String? = definedExternally /* null */): Unit = definedExternally
    open fun destroy(signal: String? = definedExternally /* null */): Unit = definedExternally
    open fun disconnect(): Unit = definedExternally
    open fun isConnected(): Boolean = definedExternally
    open fun isDead(): Boolean = definedExternally
    open var exitedAfterDisconnect: Boolean = definedExternally
    open fun addListener(event: String, listener: (args: Any) -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "disconnect" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */ = definedExternally
    open fun addListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */ = definedExternally
    override fun emit(event: String, vararg args: Any): Boolean = definedExternally
    override fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
    open fun emit(event: String /* "disconnect" */): Boolean = definedExternally
    open fun emit(event: String /* "error" */, error: Error): Boolean = definedExternally
    open fun emit(event: String /* "exit" */, code: Number, signal: String): Boolean = definedExternally
    open fun emit(event: String /* "listening" */, address: Address): Boolean = definedExternally
    open fun emit(event: String /* "message" */, message: Any, handle: net.Socket): Boolean = definedExternally
    open fun emit(event: String /* "message" */, message: Any, handle: net.Server): Boolean = definedExternally
    open fun emit(event: String /* "online" */): Boolean = definedExternally
    open fun on(event: String, listener: (args: Any) -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "disconnect" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */ = definedExternally
    open fun on(event: String /* "online" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String, listener: (args: Any) -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "disconnect" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */ = definedExternally
    open fun once(event: String /* "online" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String, listener: (args: Any) -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "disconnect" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */ = definedExternally
    open fun prependListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "disconnect" */, listener: () -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */ = definedExternally
}
external interface `T$10` {
    @nativeGetter
    operator fun get(index: String): Worker?
    @nativeSetter
    operator fun set(index: String, value: Worker?)
}
external interface Cluster : events.internal.EventEmitter {
    var Worker: Worker
    fun disconnect(callback: Function<*>? = definedExternally /* null */)
    fun fork(env: Any? = definedExternally /* null */): Worker
    var isMaster: Boolean
    var isWorker: Boolean
    var settings: ClusterSettings
    fun setupMaster(settings: ClusterSettings? = definedExternally /* null */)
    var worker: Worker? get() = definedExternally; set(value) = definedExternally
    var workers: `T$10`? get() = definedExternally; set(value) = definedExternally
    fun addListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun addListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun addListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun addListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun addListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun addListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun addListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun addListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "disconnect" */, worker: Worker): Boolean
    fun emit(event: String /* "exit" */, worker: Worker, code: Number, signal: String): Boolean
    fun emit(event: String /* "fork" */, worker: Worker): Boolean
    fun emit(event: String /* "listening" */, worker: Worker, address: Address): Boolean
    fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: net.Socket): Boolean
    fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: net.Server): Boolean
    fun emit(event: String /* "online" */, worker: Worker): Boolean
    fun emit(event: String /* "setup" */, settings: Any): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun on(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun on(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun on(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun on(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun on(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun on(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun on(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster /* this */
    fun once(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun once(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun once(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun once(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun once(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun once(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun once(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun once(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster /* this */
}
external fun disconnect(callback: Function<*>? = definedExternally /* null */): Unit = definedExternally
external fun fork(env: Any? = definedExternally /* null */): Worker = definedExternally
external var isMaster: Boolean = definedExternally
external var isWorker: Boolean = definedExternally
external var settings: ClusterSettings = definedExternally
external fun setupMaster(settings: ClusterSettings? = definedExternally /* null */): Unit = definedExternally
external var worker: Worker = definedExternally
external object workers {
    @nativeGetter
    operator fun get(index: String): Worker?
    @nativeSetter
    operator fun set(index: String, value: Worker?)
}
external fun addListener(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun addListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster = definedExternally
external fun emit(event: String, vararg args: Any): Boolean = definedExternally
external fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
external fun emit(event: String /* "disconnect" */, worker: Worker): Boolean = definedExternally
external fun emit(event: String /* "exit" */, worker: Worker, code: Number, signal: String): Boolean = definedExternally
external fun emit(event: String /* "fork" */, worker: Worker): Boolean = definedExternally
external fun emit(event: String /* "listening" */, worker: Worker, address: Address): Boolean = definedExternally
external fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: net.Socket): Boolean = definedExternally
external fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: net.Server): Boolean = definedExternally
external fun emit(event: String /* "online" */, worker: Worker): Boolean = definedExternally
external fun emit(event: String /* "setup" */, settings: Any): Boolean = definedExternally
external fun on(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun on(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun on(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster = definedExternally
external fun on(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun on(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster = definedExternally
external fun on(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster = definedExternally
external fun on(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun on(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster = definedExternally
external fun once(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun once(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun once(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster = definedExternally
external fun once(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun once(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster = definedExternally
external fun once(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster = definedExternally
external fun once(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun once(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster = definedExternally
external fun removeListener(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun removeAllListeners(event: String? = definedExternally /* null */): Cluster = definedExternally
external fun setMaxListeners(n: Number): Cluster = definedExternally
external fun getMaxListeners(): Number = definedExternally
external fun listeners(event: String): Array<Function<*>> = definedExternally
external fun listenerCount(type: String): Number = definedExternally
external fun prependListener(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "disconnect" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "fork" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "online" */, listener: (worker: Worker) -> Unit): Cluster = definedExternally
external fun prependOnceListener(event: String /* "setup" */, listener: (settings: Any) -> Unit): Cluster = definedExternally
external fun eventNames(): Array<String> = definedExternally
