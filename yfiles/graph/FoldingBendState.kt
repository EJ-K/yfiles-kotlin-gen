// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A data container representing the state of a bend of a [FoldingEdgeState].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingBendState">Online Documentation</a>
 */
external class FoldingBendState   {
  /**
   * Gets the bend's index in the [bends][FoldingEdgeState] of its owner.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingBendState%23index">Online Documentation</a>
   */
  final val index: Int
  
  /**
   * Gets or sets the location of the bend.
   * @throws ArgumentError `value` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingBendState%23location">Online Documentation</a>
   */
  final var location: Point
  
  /**
   * Gets or sets the tag of the bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingBendState%23tag">Online Documentation</a>
   */
  final var tag: Tag?
  
  /**
   * Returns an [IBend] instance which represents this bend state.
   * @return An [IBend] instance which represents this bend state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingBendState%23FoldingBendState-method-asBend">Online Documentation</a>
   */
  fun asBend(): IBend
  
  companion object : ClassMetadata<FoldingBendState> {
  }
}
