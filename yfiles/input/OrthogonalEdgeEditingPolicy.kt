// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration defining different policies to enable or disable some aspects of creation or editing of orthogonal edges.
 * @see [CreateEdgeInputMode.orthogonalEdgeCreation]
 * @see [GraphEditorInputMode.orthogonalBendRemoval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy">Online Documentation</a>
 */
external sealed class OrthogonalEdgeEditingPolicy: YEnum<OrthogonalEdgeEditingPolicy> {
   companion object: EnumMetadata<OrthogonalEdgeEditingPolicy> {
       /**
 * Enables orthogonal edge creation or editing for a specific sub-aspect automatically if an [OrthogonalEdgeEditingContext.enabled] [OrthogonalEdgeEditingContext] instance is set in the [parent input mode][GraphEditorInputMode.orthogonalEdgeEditingContext].
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23AUTO">Online Documentation</a>
 */
val AUTO: OrthogonalEdgeEditingPolicy

/**
 * Enables orthogonal edge creation or editing for a specific sub-aspect of edge creation.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: OrthogonalEdgeEditingPolicy

/**
 * Disables orthogonal edge creation or editing for a specific sub-aspect of edge creation.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23NEVER">Online Documentation</a>
 */
val NEVER: OrthogonalEdgeEditingPolicy
   }
}
