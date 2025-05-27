// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that allows a mark and identify shared resources.
 * @see [IReferenceHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandle">Online Documentation</a>
 */
external interface IReferenceHandle : YObject {
/**
 * Gets the id that identifies the resource in the GraphML document.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandle%23id">Online Documentation</a>
 */
val id: ElementId
/**
 * Gets the type of a resource (external or internal)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandle%23referenceType">Online Documentation</a>
 */
val referenceType: GraphMLReferenceType
/**
 * Gets the resource that is encapsulated by the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReferenceHandle%23subject">Online Documentation</a>
 */
val subject: Any

companion object : InterfaceMetadata<IReferenceHandle> {
}
}
