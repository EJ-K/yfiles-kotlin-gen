// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.INode
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata
import yfiles.styles.TableRenderingOrder

/**
 * Support class that allows to iterate over hits on table elements or subregions of table elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeHitTester">Online Documentation</a>
 * 
 * @constructor Create a new instance for a specific table instance that uses the order specified by `tableRenderingOrder` to determine the order of the hit test results.
 * @param [table] The table to use
 * @param [tableRenderingOrder] The hit test order. This determines the order in which stripes are returned by [enumerateHits][StripeHitTester]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeHitTester%23StripeHitTester-constructor-StripeHitTester">Online Documentation</a>
 * 
 * @property tableRenderingOrder
 * Gets the hit test order that is currently used by this instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeHitTester%23tableRenderingOrder">Online Documentation</a>
 */
external class StripeHitTester (
table: ITable,
final val tableRenderingOrder: TableRenderingOrder)  {
  /**
   * Return a collection of hits at `location`.
   * @param [context] The input mode context to use.
   * @param [location] The location in absolute coordinates.
   * @param [node] The node where the table instance is currently bound to.
   * @return A collection of [StripeSubregion]s at `location`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeHitTester%23StripeHitTester-method-enumerateHits">Online Documentation</a>
   */
  fun enumerateHits(
    context: IInputModeContext,
    location: Point,
    node: INode,
  ): IEnumerable<StripeSubregion>
  
  companion object : ClassMetadata<StripeHitTester> {
  }
}
