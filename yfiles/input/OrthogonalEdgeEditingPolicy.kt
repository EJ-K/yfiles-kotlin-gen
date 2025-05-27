// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * Enumeration defining different policies to enable or disable some aspects of creation or editing of orthogonal edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy">Online Documentation</a>
 */

sealed external class OrthogonalEdgeEditingPolicy {
  /**
   * Enables orthogonal edge creation or editing for a specific sub-aspect automatically if an [enabled][OrthogonalEdgeEditingContext] [OrthogonalEdgeEditingContext] instance is set in the [parent input mode][GraphEditorInputMode].
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23AUTO">Online Documentation</a>
   */
  object AUTO: OrthogonalEdgeEditingPolicy
  
  /**
   * Enables orthogonal edge creation or editing for a specific sub-aspect of edge creation.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23ALWAYS">Online Documentation</a>
   */
  object ALWAYS: OrthogonalEdgeEditingPolicy
  
  /**
   * Disables orthogonal edge creation or editing for a specific sub-aspect of edge creation.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingPolicy%23NEVER">Online Documentation</a>
   */
  object NEVER: OrthogonalEdgeEditingPolicy
}
