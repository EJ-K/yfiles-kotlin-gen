// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Specifies the type of the shared resource.
 * @see [IReferenceHandle.referenceType]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLReferenceType">Online Documentation</a>
 */
external sealed class GraphMLReferenceType: YEnum<GraphMLReferenceType> {
   companion object: EnumMetadata<GraphMLReferenceType> {
       /**
 * Specifies an internal resource, that is the serialized form of the resource is stored in the GraphML document itself.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLReferenceType%23INTERNAL">Online Documentation</a>
 */
val INTERNAL: GraphMLReferenceType

/**
 * Specifies an external resource, that is the resource description is not stored in the GraphML document itself.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLReferenceType%23EXTERNAL">Online Documentation</a>
 */
val EXTERNAL: GraphMLReferenceType
   }
}
