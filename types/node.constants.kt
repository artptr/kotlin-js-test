@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("constants")
package constants

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

external var E2BIG: Number = definedExternally
external var EACCES: Number = definedExternally
external var EADDRINUSE: Number = definedExternally
external var EADDRNOTAVAIL: Number = definedExternally
external var EAFNOSUPPORT: Number = definedExternally
external var EAGAIN: Number = definedExternally
external var EALREADY: Number = definedExternally
external var EBADF: Number = definedExternally
external var EBADMSG: Number = definedExternally
external var EBUSY: Number = definedExternally
external var ECANCELED: Number = definedExternally
external var ECHILD: Number = definedExternally
external var ECONNABORTED: Number = definedExternally
external var ECONNREFUSED: Number = definedExternally
external var ECONNRESET: Number = definedExternally
external var EDEADLK: Number = definedExternally
external var EDESTADDRREQ: Number = definedExternally
external var EDOM: Number = definedExternally
external var EEXIST: Number = definedExternally
external var EFAULT: Number = definedExternally
external var EFBIG: Number = definedExternally
external var EHOSTUNREACH: Number = definedExternally
external var EIDRM: Number = definedExternally
external var EILSEQ: Number = definedExternally
external var EINPROGRESS: Number = definedExternally
external var EINTR: Number = definedExternally
external var EINVAL: Number = definedExternally
external var EIO: Number = definedExternally
external var EISCONN: Number = definedExternally
external var EISDIR: Number = definedExternally
external var ELOOP: Number = definedExternally
external var EMFILE: Number = definedExternally
external var EMLINK: Number = definedExternally
external var EMSGSIZE: Number = definedExternally
external var ENAMETOOLONG: Number = definedExternally
external var ENETDOWN: Number = definedExternally
external var ENETRESET: Number = definedExternally
external var ENETUNREACH: Number = definedExternally
external var ENFILE: Number = definedExternally
external var ENOBUFS: Number = definedExternally
external var ENODATA: Number = definedExternally
external var ENODEV: Number = definedExternally
external var ENOENT: Number = definedExternally
external var ENOEXEC: Number = definedExternally
external var ENOLCK: Number = definedExternally
external var ENOLINK: Number = definedExternally
external var ENOMEM: Number = definedExternally
external var ENOMSG: Number = definedExternally
external var ENOPROTOOPT: Number = definedExternally
external var ENOSPC: Number = definedExternally
external var ENOSR: Number = definedExternally
external var ENOSTR: Number = definedExternally
external var ENOSYS: Number = definedExternally
external var ENOTCONN: Number = definedExternally
external var ENOTDIR: Number = definedExternally
external var ENOTEMPTY: Number = definedExternally
external var ENOTSOCK: Number = definedExternally
external var ENOTSUP: Number = definedExternally
external var ENOTTY: Number = definedExternally
external var ENXIO: Number = definedExternally
external var EOPNOTSUPP: Number = definedExternally
external var EOVERFLOW: Number = definedExternally
external var EPERM: Number = definedExternally
external var EPIPE: Number = definedExternally
external var EPROTO: Number = definedExternally
external var EPROTONOSUPPORT: Number = definedExternally
external var EPROTOTYPE: Number = definedExternally
external var ERANGE: Number = definedExternally
external var EROFS: Number = definedExternally
external var ESPIPE: Number = definedExternally
external var ESRCH: Number = definedExternally
external var ETIME: Number = definedExternally
external var ETIMEDOUT: Number = definedExternally
external var ETXTBSY: Number = definedExternally
external var EWOULDBLOCK: Number = definedExternally
external var EXDEV: Number = definedExternally
external var WSAEINTR: Number = definedExternally
external var WSAEBADF: Number = definedExternally
external var WSAEACCES: Number = definedExternally
external var WSAEFAULT: Number = definedExternally
external var WSAEINVAL: Number = definedExternally
external var WSAEMFILE: Number = definedExternally
external var WSAEWOULDBLOCK: Number = definedExternally
external var WSAEINPROGRESS: Number = definedExternally
external var WSAEALREADY: Number = definedExternally
external var WSAENOTSOCK: Number = definedExternally
external var WSAEDESTADDRREQ: Number = definedExternally
external var WSAEMSGSIZE: Number = definedExternally
external var WSAEPROTOTYPE: Number = definedExternally
external var WSAENOPROTOOPT: Number = definedExternally
external var WSAEPROTONOSUPPORT: Number = definedExternally
external var WSAESOCKTNOSUPPORT: Number = definedExternally
external var WSAEOPNOTSUPP: Number = definedExternally
external var WSAEPFNOSUPPORT: Number = definedExternally
external var WSAEAFNOSUPPORT: Number = definedExternally
external var WSAEADDRINUSE: Number = definedExternally
external var WSAEADDRNOTAVAIL: Number = definedExternally
external var WSAENETDOWN: Number = definedExternally
external var WSAENETUNREACH: Number = definedExternally
external var WSAENETRESET: Number = definedExternally
external var WSAECONNABORTED: Number = definedExternally
external var WSAECONNRESET: Number = definedExternally
external var WSAENOBUFS: Number = definedExternally
external var WSAEISCONN: Number = definedExternally
external var WSAENOTCONN: Number = definedExternally
external var WSAESHUTDOWN: Number = definedExternally
external var WSAETOOMANYREFS: Number = definedExternally
external var WSAETIMEDOUT: Number = definedExternally
external var WSAECONNREFUSED: Number = definedExternally
external var WSAELOOP: Number = definedExternally
external var WSAENAMETOOLONG: Number = definedExternally
external var WSAEHOSTDOWN: Number = definedExternally
external var WSAEHOSTUNREACH: Number = definedExternally
external var WSAENOTEMPTY: Number = definedExternally
external var WSAEPROCLIM: Number = definedExternally
external var WSAEUSERS: Number = definedExternally
external var WSAEDQUOT: Number = definedExternally
external var WSAESTALE: Number = definedExternally
external var WSAEREMOTE: Number = definedExternally
external var WSASYSNOTREADY: Number = definedExternally
external var WSAVERNOTSUPPORTED: Number = definedExternally
external var WSANOTINITIALISED: Number = definedExternally
external var WSAEDISCON: Number = definedExternally
external var WSAENOMORE: Number = definedExternally
external var WSAECANCELLED: Number = definedExternally
external var WSAEINVALIDPROCTABLE: Number = definedExternally
external var WSAEINVALIDPROVIDER: Number = definedExternally
external var WSAEPROVIDERFAILEDINIT: Number = definedExternally
external var WSASYSCALLFAILURE: Number = definedExternally
external var WSASERVICE_NOT_FOUND: Number = definedExternally
external var WSATYPE_NOT_FOUND: Number = definedExternally
external var WSA_E_NO_MORE: Number = definedExternally
external var WSA_E_CANCELLED: Number = definedExternally
external var WSAEREFUSED: Number = definedExternally
external var SIGHUP: Number = definedExternally
external var SIGINT: Number = definedExternally
external var SIGILL: Number = definedExternally
external var SIGABRT: Number = definedExternally
external var SIGFPE: Number = definedExternally
external var SIGKILL: Number = definedExternally
external var SIGSEGV: Number = definedExternally
external var SIGTERM: Number = definedExternally
external var SIGBREAK: Number = definedExternally
external var SIGWINCH: Number = definedExternally
external var SSL_OP_ALL: Number = definedExternally
external var SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Number = definedExternally
external var SSL_OP_CIPHER_SERVER_PREFERENCE: Number = definedExternally
external var SSL_OP_CISCO_ANYCONNECT: Number = definedExternally
external var SSL_OP_COOKIE_EXCHANGE: Number = definedExternally
external var SSL_OP_CRYPTOPRO_TLSEXT_BUG: Number = definedExternally
external var SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Number = definedExternally
external var SSL_OP_EPHEMERAL_RSA: Number = definedExternally
external var SSL_OP_LEGACY_SERVER_CONNECT: Number = definedExternally
external var SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Number = definedExternally
external var SSL_OP_MICROSOFT_SESS_ID_BUG: Number = definedExternally
external var SSL_OP_MSIE_SSLV2_RSA_PADDING: Number = definedExternally
external var SSL_OP_NETSCAPE_CA_DN_BUG: Number = definedExternally
external var SSL_OP_NETSCAPE_CHALLENGE_BUG: Number = definedExternally
external var SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Number = definedExternally
external var SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Number = definedExternally
external var SSL_OP_NO_COMPRESSION: Number = definedExternally
external var SSL_OP_NO_QUERY_MTU: Number = definedExternally
external var SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Number = definedExternally
external var SSL_OP_NO_SSLv2: Number = definedExternally
external var SSL_OP_NO_SSLv3: Number = definedExternally
external var SSL_OP_NO_TICKET: Number = definedExternally
external var SSL_OP_NO_TLSv1: Number = definedExternally
external var SSL_OP_NO_TLSv1_1: Number = definedExternally
external var SSL_OP_NO_TLSv1_2: Number = definedExternally
external var SSL_OP_PKCS1_CHECK_1: Number = definedExternally
external var SSL_OP_PKCS1_CHECK_2: Number = definedExternally
external var SSL_OP_SINGLE_DH_USE: Number = definedExternally
external var SSL_OP_SINGLE_ECDH_USE: Number = definedExternally
external var SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Number = definedExternally
external var SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Number = definedExternally
external var SSL_OP_TLS_BLOCK_PADDING_BUG: Number = definedExternally
external var SSL_OP_TLS_D5_BUG: Number = definedExternally
external var SSL_OP_TLS_ROLLBACK_BUG: Number = definedExternally
external var ENGINE_METHOD_DSA: Number = definedExternally
external var ENGINE_METHOD_DH: Number = definedExternally
external var ENGINE_METHOD_RAND: Number = definedExternally
external var ENGINE_METHOD_ECDH: Number = definedExternally
external var ENGINE_METHOD_ECDSA: Number = definedExternally
external var ENGINE_METHOD_CIPHERS: Number = definedExternally
external var ENGINE_METHOD_DIGESTS: Number = definedExternally
external var ENGINE_METHOD_STORE: Number = definedExternally
external var ENGINE_METHOD_PKEY_METHS: Number = definedExternally
external var ENGINE_METHOD_PKEY_ASN1_METHS: Number = definedExternally
external var ENGINE_METHOD_ALL: Number = definedExternally
external var ENGINE_METHOD_NONE: Number = definedExternally
external var DH_CHECK_P_NOT_SAFE_PRIME: Number = definedExternally
external var DH_CHECK_P_NOT_PRIME: Number = definedExternally
external var DH_UNABLE_TO_CHECK_GENERATOR: Number = definedExternally
external var DH_NOT_SUITABLE_GENERATOR: Number = definedExternally
external var NPN_ENABLED: Number = definedExternally
external var RSA_PKCS1_PADDING: Number = definedExternally
external var RSA_SSLV23_PADDING: Number = definedExternally
external var RSA_NO_PADDING: Number = definedExternally
external var RSA_PKCS1_OAEP_PADDING: Number = definedExternally
external var RSA_X931_PADDING: Number = definedExternally
external var RSA_PKCS1_PSS_PADDING: Number = definedExternally
external var POINT_CONVERSION_COMPRESSED: Number = definedExternally
external var POINT_CONVERSION_UNCOMPRESSED: Number = definedExternally
external var POINT_CONVERSION_HYBRID: Number = definedExternally
external var O_RDONLY: Number = definedExternally
external var O_WRONLY: Number = definedExternally
external var O_RDWR: Number = definedExternally
external var S_IFMT: Number = definedExternally
external var S_IFREG: Number = definedExternally
external var S_IFDIR: Number = definedExternally
external var S_IFCHR: Number = definedExternally
external var S_IFBLK: Number = definedExternally
external var S_IFIFO: Number = definedExternally
external var S_IFSOCK: Number = definedExternally
external var S_IRWXU: Number = definedExternally
external var S_IRUSR: Number = definedExternally
external var S_IWUSR: Number = definedExternally
external var S_IXUSR: Number = definedExternally
external var S_IRWXG: Number = definedExternally
external var S_IRGRP: Number = definedExternally
external var S_IWGRP: Number = definedExternally
external var S_IXGRP: Number = definedExternally
external var S_IRWXO: Number = definedExternally
external var S_IROTH: Number = definedExternally
external var S_IWOTH: Number = definedExternally
external var S_IXOTH: Number = definedExternally
external var S_IFLNK: Number = definedExternally
external var O_CREAT: Number = definedExternally
external var O_EXCL: Number = definedExternally
external var O_NOCTTY: Number = definedExternally
external var O_DIRECTORY: Number = definedExternally
external var O_NOATIME: Number = definedExternally
external var O_NOFOLLOW: Number = definedExternally
external var O_SYNC: Number = definedExternally
external var O_DSYNC: Number = definedExternally
external var O_SYMLINK: Number = definedExternally
external var O_DIRECT: Number = definedExternally
external var O_NONBLOCK: Number = definedExternally
external var O_TRUNC: Number = definedExternally
external var O_APPEND: Number = definedExternally
external var F_OK: Number = definedExternally
external var R_OK: Number = definedExternally
external var W_OK: Number = definedExternally
external var X_OK: Number = definedExternally
external var UV_UDP_REUSEADDR: Number = definedExternally
external var SIGQUIT: Number = definedExternally
external var SIGTRAP: Number = definedExternally
external var SIGIOT: Number = definedExternally
external var SIGBUS: Number = definedExternally
external var SIGUSR1: Number = definedExternally
external var SIGUSR2: Number = definedExternally
external var SIGPIPE: Number = definedExternally
external var SIGALRM: Number = definedExternally
external var SIGCHLD: Number = definedExternally
external var SIGSTKFLT: Number = definedExternally
external var SIGCONT: Number = definedExternally
external var SIGSTOP: Number = definedExternally
external var SIGTSTP: Number = definedExternally
external var SIGTTIN: Number = definedExternally
external var SIGTTOU: Number = definedExternally
external var SIGURG: Number = definedExternally
external var SIGXCPU: Number = definedExternally
external var SIGXFSZ: Number = definedExternally
external var SIGVTALRM: Number = definedExternally
external var SIGPROF: Number = definedExternally
external var SIGIO: Number = definedExternally
external var SIGPOLL: Number = definedExternally
external var SIGPWR: Number = definedExternally
external var SIGSYS: Number = definedExternally
external var SIGUNUSED: Number = definedExternally
external var defaultCoreCipherList: String = definedExternally
external var defaultCipherList: String = definedExternally
external var ENGINE_METHOD_RSA: Number = definedExternally
external var ALPN_ENABLED: Number = definedExternally
