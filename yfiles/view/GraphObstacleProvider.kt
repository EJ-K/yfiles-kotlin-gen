// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.GeneralPath
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata

/**
 * An implementation of the [IObstacleProvider] interface that uses the [edges][IGraph] and [nodes][IGraph] of an [IGraph] as obstacles.
 * @see [BridgeManager.addObstacleProvider]
 * @see [BridgeManager]
 * @see [IObstacleProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphObstacleProvider">Online Documentation</a>
 */
open external class GraphObstacleProvider  : IObstacleProvider {
  /**
   * Gets or sets a value indicating whether to query the [edges][IGraph] for an [IObstacleProvider] implementation.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphObstacleProvider%23queryEdges">Online Documentation</a>
   */
  final var queryEdges: Boolean
  
  /**
   * Gets or sets a value indicating whether to query the [nodes][IGraph] for an [IObstacleProvider] implementation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphObstacleProvider%23queryNodes">Online Documentation</a>
   */
  final var queryNodes: Boolean
  
  /**
   * Helper method that retrieves the [IGraph] to use from the `context`
   * @param [context] The context to retrieve the implementation from.
   * @return The [IGraph] instance to query or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphObstacleProvider%23GraphObstacleProvider-method-getGraph">Online Documentation</a>
   */
  protected open fun getGraph(
    context: IRenderContext,
  ): IGraph?
  
  /**
   * Iterates over all [edges][IGraph] and [nodes][IGraph] to query an [IObstacleProvider] from the [IModelItem][yfiles.graph.IModelItem]'s [lookup][yfiles.collections.ILookup].
   * @param [context] The context where the obstacles are queried for.
   * @return A path that is the concatenated path of all obstacles for the given context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphObstacleProvider%23GraphObstacleProvider-method-getObstacles">Online Documentation</a>
   */
  override fun getObstacles(
    context: IRenderContext,
  ): GeneralPath?
  
  companion object : ClassMetadata<GraphObstacleProvider> {
  }
}
