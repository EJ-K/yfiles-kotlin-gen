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
import yfiles.lang.TimeSpan
import yfiles.lang.YObject
import yfiles.view.GraphComponent
import yfiles.view.IAnimation
import yfiles.view.ISelectionModel

/**
 * Executes an algorithm or [ILayoutAlgorithm] on a graph asynchronously and optionally animates the transition to the new layout, afterwards.
 * @see [LayoutExecutorAsyncWorker]
 * @see [LayoutExecutor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a layout execution helper that will asynchronously perform the calculations and optionally animate the layout on the given `graphComponent`.
 * @param [messageHandler] The function that will send the data to the remote [worker][LayoutExecutorAsyncWorker]. It's an asynchronous function that will need to resolve it's `Promise` once it receives the processed data from the worker. The parameter passed to (and returned from) the function is JSON serializable and <a href="https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm">structurally cloneable</a>. Otherwise, the contents of the data blob are considered an implementation detail and may change at any time between releases.
 * @param [graphComponent] The graph component from which the [graph][GraphComponent.graph] and [GraphComponent.selection] will be taken and in which the animation will be performed.
 * @param [layoutDescriptor] The optional descriptor to serialize and send to the worker. This property can later be set and reset via the [layoutDescriptor] property.
 * @param [layoutData] The optional data that is associated with the graph items that needs to be transferred to the worker. This property can also later be set and reset via the [layoutData] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-constructor-LayoutExecutorAsync(WorkerMessageHandler,GraphComponent,Object,LayoutData)">Online Documentation</a>
 */
external open class LayoutExecutorAsync  ( messageHandler: WorkerMessageHandler ,
 graphComponent: GraphComponent ,
 layoutDescriptor: LayoutDescriptor?  = definedExternally,
 layoutData: LayoutData?  = definedExternally) : YObject {
/**
 * Creates a new instance of a layout execution helper that will asynchronously perform the calculations and apply the results on the provided `graph`.
 * @param [messageHandler] The function that will send the data to the remote [worker][LayoutExecutorAsyncWorker]. It's an asynchronous function that will need to resolve it's `Promise` once it receives the processed data from the worker. The parameter passed to (and returned from) the function is JSON serializable and <a href="https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm">structurally cloneable</a>. Otherwise, the contents of the data blob are considered an implementation detail and may change at any time between releases.
 * @param [graph] The graph that will be serialized and transferred to the worker.
 * @param [layoutDescriptor] The optional descriptor to serialize and send to the worker. This property can later be set and reset via the [layoutDescriptor] property.
 * @param [layoutData] The optional data that is associated with the graph items that needs to be transferred to the worker. This property can also later be set and reset via the [layoutData] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-constructor-LayoutExecutorAsync(WorkerMessageHandler,IGraph,Object,LayoutData)">Online Documentation</a>
 */
 constructor( messageHandler: WorkerMessageHandler ,
 graph: IGraph ,
 layoutDescriptor: LayoutDescriptor?  = definedExternally,
 layoutData: LayoutData?  = definedExternally)

/**
 * Gets or sets a value indicating whether user interaction should be allowed during the execution and animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23allowUserInteraction">Online Documentation</a>
 */
final var allowUserInteraction: Boolean
/**
 * Gets or sets a value indicating whether the viewport should be animated to the new bounds of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23animateViewport">Online Documentation</a>
 */
final var animateViewport: Boolean
/**
 * Gets or sets a value indicating whether edge groups are automatically created for edges that are connected to the same port.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see [fixPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23automaticEdgeGrouping">Online Documentation</a>
 */
final var automaticEdgeGrouping: Boolean
/**
 * Gets or sets the duration a layout may run before being cancelled automatically.
 * @throws ArgumentError if the duration is negative
 * @see [AbortHandler.cancelDuration][yfiles.algorithms.AbortHandler.cancelDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23cancelDuration">Online Documentation</a>
 */
open var cancelDuration: TimeSpan
/**
 * Gets or sets a value indicating whether to automatically perform calls to [TableLayoutConfigurator.prepare] and [TableLayoutConfigurator.restore] in order to layout table nodes.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23configureTableLayout">Online Documentation</a>
 */
final var configureTableLayout: Boolean
/**
 * Gets or sets a value indicating whether to respect the [CanvasComponent.viewportLimiter][yfiles.view.CanvasComponent.viewportLimiter] of the [GraphComponent] of this instance.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23considerViewportLimiter">Online Documentation</a>
 */
final var considerViewportLimiter: Boolean
/**
 * Gets or sets the duration of the animation.
 * 
 * The default value is [TimeSpan.ZERO].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23duration">Online Documentation</a>
 */
final var duration: TimeSpan
/**
 * Gets or sets a value indicating whether to use eased animation.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23easedAnimation">Online Documentation</a>
 */
final var easedAnimation: Boolean
/**
 * Gets a [mapping][IMapper] from edges in the [graph] to their new layout, after the results are in.
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
 * Gets or sets a value that controls whether strong port constraints are automatically created.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see [automaticEdgeGrouping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23fixPorts">Online Documentation</a>
 */
final var fixPorts: Boolean
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
 * Gets the component this instance has been created for.
 * @see [graphComponent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23graphControl">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
protected final val graphControl: GraphComponent?
/**
 * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
 * @see [edgePortNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23hideEdgesAtEdges">Online Documentation</a>
 */
final var hideEdgesAtEdges: Boolean
/**
 * Gets a value indicating whether the results of the current run have already been calculated and returned successfully to this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23isResultAvailable">Online Documentation</a>
 */
final val isResultAvailable: Boolean
/**
 * Gets a [mapping][IMapper] from labels in the [graph] to their new [layout][ILabel.layout], after the results are in.
 * @throws InvalidOperationError Throws when the results are not yet available.
 * @see [isResultAvailable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelEndBounds">Online Documentation</a>
 */
protected final val labelEndBounds: IMapper<ILabel, IOrientedRectangle>
/**
 * Gets a [mapping][IMapper] from labels in the [graph] to their new [layout parameters][ILabel.layoutParameter], after the results are in.
 * @throws InvalidOperationError Throws when the results are not yet available.
 * @see [isResultAvailable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelEndParameter">Online Documentation</a>
 */
protected final val labelEndParameter: IMapper<ILabel, ILabelModelParameter>
/**
 * Gets or sets how [ILabel]s at [IEdge]s should be placed by the layout algorithm.
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see [LayoutGraphAdapter.labelPreferredPlacementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23labelPreferredPlacementPolicy">Online Documentation</a>
 */
final var labelPreferredPlacementPolicy: LabelPreferredPlacementPolicy
/**
 * Gets or sets the layout data that is applied when [starting][start] the executor.
 * @see [layoutDescriptor]
 * @see [LayoutExecutorAsyncWorker]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23layoutData">Online Documentation</a>
 */
final var layoutData: LayoutData?
/**
 * Gets or sets the descriptor that will be sent to the [worker][LayoutExecutorAsyncWorker].
 * @see [layoutData]
 * @see [LayoutExecutorAsyncWorker]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23layoutDescriptor">Online Documentation</a>
 */
final var layoutDescriptor: LayoutDescriptor?
/**
 * Gets a [mapping][IMapper] from nodes in the [graph] to their new [INode.layout], after the results are in.
 * @throws InvalidOperationError Throws when the results are not yet available.
 * @see [isResultAvailable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23nodeEndLayout">Online Documentation</a>
 */
protected final val nodeEndLayout: IMapper<INode, IRectangle>
/**
 * Gets or sets the policy that specifies how port locations should be adjusted after a layout has been calculated.
 * @see [PortCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23portAdjustmentPolicy">Online Documentation</a>
 */
final var portAdjustmentPolicy: PortAdjustmentPolicy
/**
 * Gets a [mapping][IMapper] from ports in the [graph] to their new [location parameters][IPort.locationParameter], after the results are in.
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
 * Gets a value indicating whether this instance is currently running.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23running">Online Documentation</a>
 */
final val running: Boolean
/**
 * Gets or sets the [ISelectionModel] to use for the automatically registered [IDataProvider][yfiles.algorithms.IDataProvider] instances for [LayoutKeys.AFFECTED_NODES_DP_KEY] and [LayoutKeys.AFFECTED_EDGES_DP_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23selectionModel">Online Documentation</a>
 */
final var selectionModel: ISelectionModel<IModelItem>?
/**
 * Gets or sets a value that controls whether the possible candidates for label positions are also serialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23sendLabelCandidates">Online Documentation</a>
 */
final var sendLabelCandidates: Boolean
/**
 * Gets or sets a value indicating whether this instance waits for other instances to finish their operations before it executes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23sequentialExecution">Online Documentation</a>
 */
final var sequentialExecution: Boolean
/**
 * Gets or sets the duration a layout may run before being stopped automatically.
 * @throws ArgumentError if the duration is negative
 * @see [AbortHandler.stopDuration][yfiles.algorithms.AbortHandler.stopDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23stopDuration">Online Documentation</a>
 */
open var stopDuration: TimeSpan
/**
 * Gets the [tableLayoutConfigurator] that is used if [configureTableLayout] is enabled.
 * @see [createTableLayoutConfigurator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23tableLayoutConfigurator">Online Documentation</a>
 */
final val tableLayoutConfigurator: TableLayoutConfigurator
/**
 * Gets or sets the insets (in world coordinates) that will be added to the content rectangle when calculating the target viewport.
 * 
 * The default value is [Insets.EMPTY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23targetBoundsInsets">Online Documentation</a>
 */
final var targetBoundsInsets: Insets
/**
 * Gets or sets a value indicating whether the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] property of the [graphControl] should be updated upon completion.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23updateContentRect">Online Documentation</a>
 */
final var updateContentRect: Boolean
/**
 * Cancels a currently running layout calculation or animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-cancel">Online Documentation</a>
 */
 final   fun cancel():Promise<Void>
/**
 * Factory method that creates the [IAnimation] that will be used by this instance after the layout has been calculated.
 * @return The animation to use after the layout.
 * @see [duration]
 * @see [animateViewport]
 * @see [createMorphAnimation]
 * @see [createViewportAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createAnimation">Online Documentation</a>
 */
 open protected   fun createAnimation():IAnimation
/**
 * Callback factory method that creates the [IRectangle] for the given [IPort] that is used as a dummy to represent the port at the [IEdge] that owns `port`.
 * @param [port] The port to create the layout for.
 * @return An [IRectangle] that uses the [port's location][IPort.location] as the center of the node.
 * @see [edgePortNodeSize]
 * @see [hideEdgesAtEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createEdgePortLayout">Online Documentation</a>
 */
 open protected   fun createEdgePortLayout( port: IPort ):IRectangle
/**
 * Factory method that creates the animation for the [IGraph].
 * @return The animation instance.
 * @see [createAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createMorphAnimation">Online Documentation</a>
 */
 open protected   fun createMorphAnimation():IAnimation
/**
 * Creates an animation that morphs the layout of all [ITable][yfiles.graph.ITable]s in the graph.
 * @see [TableAnimation][yfiles.view.TableAnimation]
 * @see [configureTableLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createTableAnimations">Online Documentation</a>
 */
 open protected   fun createTableAnimations():IAnimation
/**
 * Create a new instance of [TableLayoutConfigurator] that is used if [configureTableLayout] is enabled.
 * @return A new instance of the [TableLayoutConfigurator] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createTableLayoutConfigurator">Online Documentation</a>
 */
 open protected   fun createTableLayoutConfigurator():TableLayoutConfigurator
/**
 * Factory method that creates the animation for the [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport].
 * @param [targetBounds] The target bounds of the animation.
 * @return The animation instance.
 * @see [createAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-createViewportAnimation">Online Documentation</a>
 */
 open protected   fun createViewportAnimation( targetBounds: Rect ):IAnimation
/**
 * Calculate the target bounds to be used for the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] as well as the [ViewportAnimation][yfiles.view.ViewportAnimation] after the layout has finished.
 * @return The desired content rectangle and the bounds for a viewport animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-getTargetBounds">Online Documentation</a>
 */
 open protected   fun getTargetBounds():Rect
/**
 * [Sets up][TableLayoutConfigurator.prepare] partition grid information from [tables][yfiles.graph.ITable] in the graph.
 * 
 * The default implementation also sets the [TableLayoutConfigurator.horizontalLayout] property depending on the [layoutDescriptor]'s "layoutOrientation" property.
 * @see [prepareTableLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-prepareTableLayout">Online Documentation</a>
 */
 open protected   fun prepareTableLayout()
/**
 * Writes the table layout information provided through [tableLayoutConfigurator] back to all tables.
 * @see [prepareTableLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-restoreTableLayout">Online Documentation</a>
 */
 open protected   fun restoreTableLayout()
/**
 * Triggers the asynchronous execution and returns a `Promise` that resolves when the calculation is done.
 * @return The promise to track the progress of the execution.
 * @throws Error
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutorAsync%23LayoutExecutorAsync-method-start">Online Documentation</a>
 */
 final   fun start():Promise<Void>

companion object : ClassMetadata<LayoutExecutorAsync> {
}
}
