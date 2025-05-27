// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface defines methods to write and configure shared sections in the resulting GraphML output
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandler">Online Documentation</a>
 */
external interface IReferenceHandler : YObject {
/**
 * Gets a collection of all registered reference handles that should be written to the GraphML shared data section.
 * @see [GraphMLIOHandler.addQueryReferenceIdListener]
 * @see [GraphMLWriter.addQueryReferenceIdListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandler%23internalHandles">Online Documentation</a>
 */
val internalHandles: IEnumerable<IReferenceHandle>
/**
 * Gets the reference handle for a given subject.
 * @param [context] The current write context.
 * @param [subject] The subject.
 * @return A handle for the resource `subject`, or `null` if the resource is not registered.
 * @see [IReferenceHandle]
 * @see [IReferenceHandle.subject]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandler%23IReferenceHandler-method-getHandle">Online Documentation</a>
 */
   fun getHandle( context: IWriteContext ,
 subject: Any? ):IReferenceHandle?
/**
 * Unregister a shared resource.
 * @param [context] The current write context.
 * @param [subject] The resource to register.
 * @see [registerResource]
 * @see [GraphMLAttribute.shareable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandler%23IReferenceHandler-method-markAsUnshared">Online Documentation</a>
 */
   fun markAsUnshared( context: IWriteContext ,
 subject: Any )
/**
 * Register a shared resource.
 * @param [context] The current write context.
 * @param [subject] The resource to register.
 * @return `true` iff the resource needs to be serialized; otherwise the resource is either a duplicate resource or is declared externally and does not need any additional handling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandler%23IReferenceHandler-method-registerResource">Online Documentation</a>
 */
   fun registerResource( context: IWriteContext ,
 subject: Any ):SharingState

companion object : InterfaceMetadata<IReferenceHandler> {
}
}
