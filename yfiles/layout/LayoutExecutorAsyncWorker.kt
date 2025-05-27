// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.core.Void
import js.promise.Promise
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * Executes an algorithm or [ILayoutAlgorithm] on a graph in a separate execution context.
 * @see [LayoutExecutorAsync]
 * @see [LayoutExecutor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a layout service worker.
 * @param [handler] The handler that will perform the actual calculations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-constructor-LayoutExecutorAsyncWorker">Online Documentation</a>
 */
open external class LayoutExecutorAsyncWorker (
  handler: WorkerHandler,
)  {
  /**
   * Factory method that creates the graph that will be passed to the worker handler
   * 
   * The default implementation simply returns a new [LayoutGraph]
   * @return The layout graph to use for the ongoing service request
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-method-createLayoutGraph">Online Documentation</a>
   */
  protected open fun createLayoutGraph(): LayoutGraph
  
  /**
   * Called by client code for each data blob received from the main thread's [layout request][LayoutExecutorAsync].
   * @param [data] The data that was given to the worker message handler. The contents of the data are considered an implementation detail and may change at any time between releases.
   * @return The Promise that will resolve to the data that needs to be sent back to the calling worker message handler.
   * @see [initializeWebWorker]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-method-process">Online Documentation</a>
   */
  fun process(
    data: Any,
  ): Promise<Void>
  
  companion object : ClassMetadata<LayoutExecutorAsyncWorker> {
    /**
     * A data provider key that can be used to retrieve information about **unconnected**ports of the original [LayoutEdge].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23UNCONNECTED_EDGE_PORTS_DATA_KEY">Online Documentation</a>
     */
     val UNCONNECTED_EDGE_PORTS_DATA_KEY: EdgeDataKey<IEnumerable<Point>>
    
    /**
     * A data provider key that can be used to retrieve information about **unconnected**ports of the original [LayoutNode].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23UNCONNECTED_NODE_PORTS_DATA_KEY">Online Documentation</a>
     */
     val UNCONNECTED_NODE_PORTS_DATA_KEY: NodeDataKey<IEnumerable<Point>>
    
    /**
     * Initializes a web worker to handle layout requests sent by a [LayoutExecutorAsync].
     * @param [handler] The handler that will perform the actual calculations
     * @throws Error Throws if called outside a web worker context.
     * @see [LayoutExecutorAsync.createWebWorkerMessageHandler]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-method-initializeWebWorker">Online Documentation</a>
     */
    fun initializeWebWorker(
      handler: WorkerHandler,
    )
  }
}
