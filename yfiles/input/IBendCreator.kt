// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.lang.InterfaceMetadata

/**
 * Callback interface for instances that can create bends for an edge and graph.
 * @see [GraphEditorInputMode.onCreateBendInputModeDragSegmentFinished]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator">Online Documentation</a>
 */
external interface IBendCreator  {
  /**
   * Creates a bend at the position supplied at the given graph for the edge whose lookup provided this creator.
   * @param [context] The context for which the bend should be created.
   * @param [graph] The graph, the edge belongs to.
   * @param [location] The preferred coordinates of the bend.
   * @return The index of the bend in the edge's [bends][yfiles.graph.IEdge] or `-1` if no bend has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23IBendCreator-method-createBend">Online Documentation</a>
   */
  fun createBend(
    context: IInputModeContext,
    graph: IGraph,
    location: Point,
  ): Int

  
  companion object : InterfaceMetadata<IBendCreator> {
    /**
     * A static instance that does not create any bends.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23NO_BENDS">Online Documentation</a>
     */
     val NO_BENDS: IBendCreator
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23IBendCreator-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      createBend: (context: IInputModeContext, graph: IGraph, location: Point) -> Int
    ): IBendCreator
  }
}
