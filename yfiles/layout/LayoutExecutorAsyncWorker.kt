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
import yfiles.algorithms.GraphObjectDpKey
import yfiles.algorithms.YPoint
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

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
external open class LayoutExecutorAsyncWorker  ( handler: WorkerHandler ) : YObject {

/**
 * Factory method that creates the graph that will be passed to the worker handler
 * 
 * The default implementation simply returns a new [DefaultLayoutGraph]
 * @return The layout graph to use for the ongoing service request
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-method-createLayoutGraph">Online Documentation</a>
 */
 open protected   fun createLayoutGraph():LayoutGraph
/**
 * Called by client code for each data blob received from the main thread's [layout request][LayoutExecutorAsync.start].
 * @param [data] The data that was given to the worker message handler. The contents of the data are considered an implementation detail and may change at any time between releases.
 * @return The Promise that will resolve to the data that needs to be sent back to the calling worker message handler.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23LayoutExecutorAsyncWorker-method-process">Online Documentation</a>
 */
 final   fun process( data: Any ):Promise<Void>

companion object : ClassMetadata<LayoutExecutorAsyncWorker> {
/**
 * A data provider key that can be used to retrieve information about **unconnected**ports of the original [Node][yfiles.algorithms.Node] or [Edge][yfiles.algorithms.Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsyncWorker%23UNCONNECTED_PORTS_DP_KEY">Online Documentation</a>
 */
 val UNCONNECTED_PORTS_DP_KEY: GraphObjectDpKey<IEnumerable<YPoint>>
}
}
