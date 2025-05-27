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
import yfiles.graph.GraphItemTypes
import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata

/**
 * An interface that can enumerate hits in an [IGraph][yfiles.graph.IGraph] of a given [type][GraphItemTypes] for a certain position in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester">Online Documentation</a>
 */
external interface IHitTester  {
  /**
   * Yields an enumerable that enumerates the hits for a given world coordinate.
   * @param [context] The context in which to perform the hit testing.
   * @param [location] the coordinates in the world coordinate system
   * @param [filter] An optional filter of the type of items to test and return. [ALL][GraphItemTypes] if not specified.
   * @return an enumerable that yields hit items of the requested type at the given coordinates
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester%23IHitTester-method-enumerateHits">Online Documentation</a>
   */
  fun enumerateHits(
    context: IInputModeContext,
    location: Point,
    filter: GraphItemTypes  = definedExternally,
  ): IEnumerable<IModelItem>

  
  companion object : InterfaceMetadata<IHitTester> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester%23IHitTester-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      enumerateHits: (context: IInputModeContext, location: Point, filter: GraphItemTypes) -> IEnumerable<IModelItem>
    ): IHitTester
  }
}
