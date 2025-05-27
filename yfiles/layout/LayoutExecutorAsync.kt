// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import yfiles.collections.IMapper
import yfiles.collections.ItemMapping
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModelParameter
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.TimeSpan
import yfiles.view.GraphComponent
import yfiles.view.IAnimation

/**
 * Executes an algorithm or [ILayoutAlgorithm] on a graph asynchronously and optionally animates the transition to the new layout, afterward.
 * @see [LayoutExecutorAsyncWorker]
 * @see [LayoutExecutor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a layout execution helper that will asynchronously perform the calculations and optionally animate the layout on the given `graphComponent`.
 * @param [messageHandler] The function that will send the data to the remote [worker][LayoutExecutorAsyncWorker]. It's an asynchronous function that will need to resolve it's `Promise` once it receives the processed data from the worker. The parameter passed to (and returned from) the function is JSON serializable and <a href="https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm">
 *          structurally
 *          cloneable
 *        </a> . Otherwise, the contents of the data blob are considered an implementation detail and may change at any time between releases.
 *   When no additional data has to be passed between the threads, the convenience method [createWebWorkerMessageHandler][LayoutExecutorAsync] can be used to create the message handler.
 * @param [graphComponent] The graph component from which the [graph][GraphComponent] and [selection][GraphComponent] will be taken and in which the animation will be performed.
 * @param [layoutDescriptor] The optional descriptor to serialize and send to the worker. This property can later be set and reset via the [Object] property.
 * @param [layoutData] The optional data that is associated with the graph items that needs to be transferred to the worker. This property can also later be set and reset via the [layoutData][LayoutExecutorAsync] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-constructor-LayoutExecutorAsync(WorkerMessageHandler,GraphComponent,Object,LayoutData)">Online Documentation</a>
 */
open external class LayoutExecutorAsync (
  messageHandler: WorkerMessageHandler,
  graphComponent: GraphComponent,
  layoutDescriptor: LayoutDescriptor?  = definedExternally,
  layoutData: LayoutData<INode, IEdge, ILabel, ILabel>?  = definedExternally,
)  {
  /**
   * Creates a new instance of a layout execution helper that will asynchronously perform the calculations and apply the results on the provided `graph`.
   * @param [messageHandler] The function that will send the data to the remote [worker][LayoutExecutorAsyncWorker]. It's an asynchronous function that will need to resolve it's `Promise` once it receives the processed data from the worker. The parameter passed to (and returned from) the function is JSON serializable and <a href="https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm">
   *          structurally
   *          cloneable
   *        </a> . Otherwise, the contents of the data blob are considered an implementation detail and may change at any time between releases.
   *   When no additional data has to be passed between the threads, the convenience method [createWebWorkerMessageHandler][LayoutExecutorAsync] can be used to create the message handler.
   * @param [graph] The graph that will be serialized and transferred to the worker.
   * @param [layoutDescriptor] The optional descriptor to serialize and send to the worker. This property can later be set and reset via the [Object] property.
   * @param [layoutData] The optional data that is associated with the graph items that needs to be transferred to the worker. This property can also later be set and reset via the [layoutData][LayoutExecutorAsync] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-constructor-LayoutExecutorAsync(WorkerMessageHandler,IGraph,Object,LayoutData)">Online Documentation</a>
   */ constructor(
    messageHandler: WorkerMessageHandler,
    graph: IGraph,
    layoutDescriptor: LayoutDescriptor?  = definedExternally,
    layoutData: LayoutData<INode, IEdge, ILabel, ILabel>?  = definedExternally,
  )
  /**
   * Gets or sets a value indicating whether user interaction should be allowed during the execution and animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23allowUserInteraction">Online Documentation</a>
   */
  final var allowUserInteraction: Boolean
  
  /**
   * Gets or sets the mapping of graph items to [LayoutAnchoringPolicy] values, specifying which part of the items should be used to anchor the graph during layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23anchoredItems">Online Documentation</a>
   */
  final var anchoredItems: ItemMapping<IModelItem, LayoutAnchoringPolicy>
  
  /**
   * Gets or sets a value indicating whether the viewport should be animated to the new bounds of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23animateViewport">Online Documentation</a>
   */
  final var animateViewport: Boolean
  
  /**
   * Gets or sets the duration of the animation.
   * 
   * The default value is [ZERO][TimeSpan].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23animationDuration">Online Documentation</a>
   */
  final var animationDuration: TimeSpan
  
  /**
   * Gets or sets the duration a layout may run before being cancelled automatically.
   * @throws ArgumentError if the duration is negative
   * @see [LayoutAbortController.cancelDuration]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23cancelDuration">Online Documentation</a>
   */
  open var cancelDuration: TimeSpan
  
  /**
   * Gets or sets a value indicating whether to automatically perform calls to [prepare][TableLayoutConfigurator] and [restore][TableLayoutConfigurator] in order to layout table nodes.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23configureTableLayout">Online Documentation</a>
   */
  final var configureTableLayout: Boolean
  
  /**
   * Gets or sets a value indicating whether to respect the [viewportLimiter][yfiles.view.CanvasComponent] of the [GraphComponent] of this instance.
   * 
   * The default value is `true`, but as updating the layout typically also [updates][LayoutExecutorAsync] the [contentBounds][yfiles.view.CanvasComponent], depending on the [ViewportLimiter][yfiles.view.ViewportLimiter] implementation and configuration, this could be set to `false`, instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23considerViewportLimiter">Online Documentation</a>
   */
  final var considerViewportLimiter: Boolean
  
  /**
   * Gets or sets a value indicating whether to use eased animation.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23easedAnimation">Online Documentation</a>
   */
  final var easedAnimation: Boolean
  
  /**
   * Gets or sets a comparison function that normalizes the order of the edges for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [nodeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23edgeComparator">Online Documentation</a>
   */
  final var edgeComparator: Comparison1<IEdge>?
  
  /**
   * Gets a [mapping][IMapper] from edges in the [LayoutGraph] to their new layout, after the results are in.
   * @throws InvalidOperationError Throws when the results are not yet available.
   * @see [isResultAvailable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23edgeEndLayout">Online Documentation</a>
   */
  protected final val edgeEndLayout: IMapper<IEdge, ReadonlyArray<IPoint>>
  
  /**
   * Gets or sets the size of the nodes that are inserted for the ports that are created for [IEdge]s that are connected at other [IEdge]s.
   * @see [hideEdgesAtEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23edgePortNodeSize">Online Documentation</a>
   */
  final var edgePortNodeSize: Size
  
  /**
   * Gets the graph this instance is working on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23graph">Online Documentation</a>
   */
  protected final val graph: IGraph
  
  /**
   * Gets the component this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23graphComponent">Online Documentation</a>
   */
  protected final val graphComponent: GraphComponent?
  
  /**
   * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
   * @see [LayoutGraphAdapter.hideEdgesAtEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23hideEdgesAtEdges">Online Documentation</a>
   */
  final var hideEdgesAtEdges: Boolean
  
  /**
   * Gets a value indicating whether the results of the current run have already been calculated and returned successfully to this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23isResultAvailable">Online Documentation</a>
   */
  final val isResultAvailable: Boolean
  
  /**
   * Gets a [mapping][IMapper] from labels in the [LayoutGraph] to their new [layout][ILabel], after the results are in.
   * @throws InvalidOperationError Throws when the results are not yet available.
   * @see [isResultAvailable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelEndBounds">Online Documentation</a>
   */
  protected final val labelEndBounds: IMapper<ILabel, IOrientedRectangle>
  
  /**
   * Gets a [mapping][IMapper] from labels in the [LayoutGraph] to their new [layout parameters][ILabel], after the results are in.
   * @throws InvalidOperationError Throws when the results are not yet available.
   * @see [isResultAvailable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelEndParameter">Online Documentation</a>
   */
  protected final val labelEndParameter: IMapper<ILabel, ILabelModelParameter>
  
  /**
   * Gets or sets a mapping that specifies how [ILabel]s should be placed by the layout algorithm.
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see [LayoutGraphAdapter.labelPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelPlacementPolicies">Online Documentation</a>
   */
  final var labelPlacementPolicies: ItemMapping<ILabel, LabelPlacementPolicy>
  
  /**
   * Gets or sets the layout data that is applied when [starting][LayoutExecutorAsync] the executor.
   * @see [Object]
   * @see [LayoutExecutorAsyncWorker]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23layoutData">Online Documentation</a>
   */
  final var layoutData: LayoutData<INode, IEdge, ILabel, ILabel>?
  
  /**
   * Gets or sets the descriptor that will be sent to the [worker][LayoutExecutorAsyncWorker].
   * @see [LayoutData]
   * @see [LayoutExecutorAsyncWorker]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23layoutDescriptor">Online Documentation</a>
   */
  final var layoutDescriptor: LayoutDescriptor?
  
  /**
   * Gets or sets a comparison function that normalizes the order of the nodes for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [edgeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23nodeComparator">Online Documentation</a>
   */
  final var nodeComparator: Comparison1<INode>?
  
  /**
   * Gets a [mapping][IMapper] from nodes in the [LayoutGraph] to their new [layout][INode], after the results are in.
   * @throws InvalidOperationError Throws when the results are not yet available.
   * @see [isResultAvailable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23nodeEndLayout">Online Documentation</a>
   */
  protected final val nodeEndLayout: IMapper<INode, IRectangle>
  
  /**
   * Gets or sets the mapping from ports to a policy that specifies how port locations should be adjusted after a layout has been calculated.
   * @see [LayoutGraphAdapter.portAdjustmentPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23portAdjustmentPolicies">Online Documentation</a>
   */
  final var portAdjustmentPolicies: ItemMapping<IPort, PortAdjustmentPolicy>
  
  /**
   * Gets a [mapping][IMapper] from ports in the [LayoutGraph] to their new [location parameters][IPort], after the results are in.
   * @throws InvalidOperationError Throws when the results are not yet available.
   * @see [isResultAvailable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23portEndParameter">Online Documentation</a>
   */
  protected final val portEndParameter: IMapper<IPort, IPortLocationModelParameter>
  
  /**
   * Gets or sets how [ILabel]s at [IPort]s should be treated by the layout algorithm.
   * @see [PortLabelPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23portLabelPolicies">Online Documentation</a>
   */
  final var portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>
  
  /**
   * Gets or sets a mapping that specifies how [IPort]s should be placed by the layout algorithm.
   * @see [EdgePortCandidates.SOURCE_PORT_CANDIDATES_DATA_KEY]
   * @see [EdgePortCandidates.TARGET_PORT_CANDIDATES_DATA_KEY]
   * @see [NodePortCandidates.NODE_PORT_CANDIDATES_DATA_KEY]
   * @see [LayoutGraphAdapter.portPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23portPlacementPolicies">Online Documentation</a>
   */
  final var portPlacementPolicies: ItemMapping<IPort, PortPlacementPolicy>
  
  /**
   * Gets a value indicating whether this instance is currently running.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23running">Online Documentation</a>
   */
  final val running: Boolean
  
  /**
   * Gets or sets a value indicating whether this instance waits for other instances to finish their operations before it executes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23sequentialExecution">Online Documentation</a>
   */
  final var sequentialExecution: Boolean
  
  /**
   * Gets or sets the duration a layout may run before being stopped automatically.
   * @throws ArgumentError if the duration is negative
   * @see [LayoutAbortController.stopDuration]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23stopDuration">Online Documentation</a>
   */
  open var stopDuration: TimeSpan
  
  /**
   * Gets the [TableLayoutConfigurator] that is used if [configureTableLayout][LayoutExecutorAsync] is enabled.
   * @see [createTableLayoutConfigurator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23tableLayoutConfigurator">Online Documentation</a>
   */
  final val tableLayoutConfigurator: TableLayoutConfigurator
  
  /**
   * Gets or sets the padding (in world coordinates) that will be added to the content bounds when calculating the target viewport.
   * 
   * The default value is [EMPTY][Insets].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23targetBoundsPadding">Online Documentation</a>
   */
  final var targetBoundsPadding: Insets
  
  /**
   * Gets or sets a value indicating whether the [contentBounds][yfiles.view.CanvasComponent] property of the [graphComponent][LayoutExecutorAsync] should be updated upon completion.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23updateContentBounds">Online Documentation</a>
   */
  final var updateContentBounds: Boolean
  
  /**
   * Cancels a currently running layout calculation or animation.
   * @return A `Promise` that will resolve once the layout calculation or animation is canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-cancel">Online Documentation</a>
   */
  fun cancel(): Promise<Void>
  
  /**
   * Factory method that creates the [IAnimation] that will be used by this instance after the layout has been calculated.
   * @return The animation to use after the layout.
   * @see [animationDuration]
   * @see [animateViewport]
   * @see [createLayoutAnimation]
   * @see [createViewportAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createAnimation">Online Documentation</a>
   */
  protected open fun createAnimation(): IAnimation
  
  /**
   * Callback factory method that creates the [IRectangle] for the given [IPort] that is used as a dummy to represent the port at the [IEdge] that owns `port`.
   * @param [port] The port to create the layout for.
   * @return An [IRectangle] that uses the [port's location][IPort] as the center of the node.
   * @see [edgePortNodeSize]
   * @see [hideEdgesAtEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createEdgePortLayout">Online Documentation</a>
   */
  protected open fun createEdgePortLayout(
    port: IPort,
  ): IRectangle
  
  /**
   * Factory method that creates the animation for the [IGraph].
   * @return The animation instance.
   * @see [createAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createLayoutAnimation">Online Documentation</a>
   */
  protected open fun createLayoutAnimation(): IAnimation
  
  /**
   * Creates an animation that morphs the layout of all [ITable][yfiles.graph.ITable]s in the graph.
   * @return The animation that morphs the layout of all [ITable][yfiles.graph.ITable]s in the graph.
   * @see [IAnimation]
   * @see [configureTableLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createTableAnimations">Online Documentation</a>
   */
  protected open fun createTableAnimations(): IAnimation
  
  /**
   * Create a new instance of [TableLayoutConfigurator] that is used if [configureTableLayout][LayoutExecutorAsync] is enabled.
   * @return A new instance of the [TableLayoutConfigurator] class.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createTableLayoutConfigurator">Online Documentation</a>
   */
  protected open fun createTableLayoutConfigurator(): TableLayoutConfigurator
  
  /**
   * Factory method that creates the animation for the [viewport][yfiles.view.CanvasComponent].
   * @param [targetBounds] The target bounds of the animation.
   * @return The animation instance.
   * @see [createAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createViewportAnimation">Online Documentation</a>
   */
  protected open fun createViewportAnimation(
    targetBounds: Rect,
  ): IAnimation
  
  /**
   * Calculate the target bounds to be used for the [contentBounds][yfiles.view.CanvasComponent] as well as the [ViewportAnimation][yfiles.view.ViewportAnimation] after the layout has finished.
   * @return The desired content bounds and the bounds for a viewport animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-getTargetBounds">Online Documentation</a>
   */
  protected open fun getTargetBounds(): Rect
  
  /**
   * [Sets up][TableLayoutConfigurator] partition grid information from [tables][yfiles.graph.ITable] in the graph.
   * 
   * The default implementation also sets the [horizontalLayout][TableLayoutConfigurator] property depending on the [layoutDescriptor][LayoutExecutorAsync]'s "layoutOrientation" property.
   * @return A [LayoutGridData] instance for all tables in the graph, or `null` if no [LayoutGrid] is necessary.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-prepareTableLayout">Online Documentation</a>
   */
  protected open fun prepareTableLayout(): LayoutGridData<INode, IEdge, ILabel, ILabel>?
  
  /**
   * Writes the table layout information provided through [tableLayoutConfigurator][LayoutExecutorAsync] back to all tables.
   * @see [prepareTableLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-restoreTableLayout">Online Documentation</a>
   */
  protected open fun restoreTableLayout()
  
  /**
   * Triggers the asynchronous execution and returns a `Promise` that resolves when the calculation is done.
   * @return The promise to track the progress of the execution.
   * @throws Error
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-start">Online Documentation</a>
   */
  fun start(): Promise<Void>
  
  companion object : ClassMetadata<LayoutExecutorAsync> {
    /**
     * Convenience method for creating a default message handler for a web worker that can be passed to the [LayoutExecutorAsync] constructor.
     * @param [worker] The web worker instance that the messages should be exchanged with.
     * @return A default message handler for the given web worker instance.
     * @see [LayoutExecutorAsyncWorker.initializeWebWorker]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createWebWorkerMessageHandler">Online Documentation</a>
     */
    fun createWebWorkerMessageHandler(
      worker: web.workers.Worker,
    ): WorkerMessageHandler
  }
}
