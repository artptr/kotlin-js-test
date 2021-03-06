@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("path") JsQualifier("posix")]
package path.posix

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

external fun normalize(p: String): String = definedExternally
external fun join(vararg paths: Any): String = definedExternally
external fun resolve(vararg pathSegments: Any): String = definedExternally
external fun isAbsolute(p: String): Boolean = definedExternally
external fun relative(from: String, to: String): String = definedExternally
external fun dirname(p: String): String = definedExternally
external fun basename(p: String, ext: String? = definedExternally /* null */): String = definedExternally
external fun extname(p: String): String = definedExternally
external var sep: String = definedExternally
external var delimiter: String = definedExternally
external fun parse(p: String): path.ParsedPath = definedExternally
external fun format(pP: path.FormatInputPathObject): String = definedExternally
