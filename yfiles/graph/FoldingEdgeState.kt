// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle

/**
 * A data container representing the state of an edge whose source and/or target node are collapsed.
 * @see [FoldingEdgeStateId]
 * @see [FoldingManager.getFoldingEdgeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState">Online Documentation</a>
 */
external class FoldingEdgeState  : FoldingLabelOwnerState {
  /**
   * Gets the [FoldingBendState]s of this state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23bends">Online Documentation</a>
   */
  final val bends: IListEnumerable<FoldingBendState>
  
  /**
   * Gets the [FoldingPortState] which represents the source port of this edge state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23sourcePort">Online Documentation</a>
   */
  final val sourcePort: FoldingPortState
  
  /**
   * Gets or sets the style of this edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23style">Online Documentation</a>
   */
  final var style: IEdgeStyle
  
  /**
   * Gets or sets the tag of the edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23tag">Online Documentation</a>
   */
  final var tag: Tag?
  
  /**
   * Gets the [FoldingPortState] which represents the target port of this edge state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23targetPort">Online Documentation</a>
   */
  final val targetPort: FoldingPortState
  
  /**
   * Adds a new [FoldingBendState] to this edge state at the given `index` and `location`.
   * @param [location] The location of the new bend state.
   * @param [index] The index the bend state shall be inserted in the [bends][FoldingEdgeState]; a negative value (which is the default) indicates that the bend should be appended to the end of the list of bends.
   * @return The newly added bend state.
   * @throws ArgumentError `location` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-addBend">Online Documentation</a>
   */
  fun addBend(
    location: Point,
    index: Int  = definedExternally,
  ): FoldingBendState
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-addLabel">Online Documentation</a>
   */
  override fun addLabel(
    text: String,
    layoutParameter: ILabelModelParameter,
    style: ILabelStyle,
    preferredSize: Size,
    tag: Tag?,
  ): FoldingLabelState
  
  /**
   * Returns an [IEdge] instance which represents this edge state.
   * @return An [IEdge] instance which represents this edge state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-asEdge">Online Documentation</a>
   */
  fun asEdge(): IEdge
  
  /**
   * Removes all [bends][FoldingEdgeState].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-clearBends">Online Documentation</a>
   */
  fun clearBends()
  
  /**
   * Removes the `bend` from this edge state.
   * @param [bend] The bend to remove.
   * @throws ArgumentError Thrown if the `bend` doesn't belong to this edge state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-removeBend">Online Documentation</a>
   */
  fun removeBend(
    bend: FoldingBendState,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeState%23FoldingEdgeState-method-removeLabel">Online Documentation</a>
   */
  override fun removeLabel(
    label: FoldingLabelState,
  )
  
  companion object : ClassMetadata<FoldingEdgeState> {
  }
}
