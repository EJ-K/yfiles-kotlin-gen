// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.List
import yfiles.lang.ClassMetadata

/**
 * Represents a [layout][ILayoutAlgorithm] that sequentially executes multiple layout algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SequentialLayout] class with an optional collection of layout algorithms.
 * @param [layouts] An optional array of [ILayoutAlgorithm] to be added to the layout chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-constructor-SequentialLayout">Online Documentation</a>
 */
open external class SequentialLayout (
  vararg layouts: ILayoutAlgorithm,
) : ILayoutAlgorithm {
  /**
   * Gets the collection of layout algorithms that are executed sequentially.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23layouts">Online Documentation</a>
   */
  final val layouts: List<ILayoutAlgorithm>
  
  /**
   * Executes all layout algorithms in the chain sequentially.
   * @param [graph] The input graph on which the layouts are applied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  companion object : ClassMetadata<SequentialLayout> {
  }
}
