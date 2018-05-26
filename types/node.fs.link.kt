@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("link")]
package fs.link

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

external fun link(existingPath: String, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: String, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: String, newPath: url.URL): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: url.URL): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: url.URL): Promise<Unit> = definedExternally
