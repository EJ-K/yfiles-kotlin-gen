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
import yfiles.algorithms.AbortHandler
import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.lang.YObject
import yfiles.view.GraphComponent
import yfiles.view.IAnimation
import yfiles.view.ISelectionModel

/**
 * Executes a [ILayoutAlgorithm] and optionally animates the transition to the calculated layout.
 * @see [LayoutExecutorAsync]
 * @see [LayoutGraphAdapter]
 * @see [GraphComponent.morphLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LayoutExecutor] class.
 * @param [graphComponent] The control which will be animated and provides the [IGraph] instance.
 * @param [graph] The graph to layout.
 * @param [layout] The [ILayoutAlgorithm] to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-constructor-LayoutExecutor(GraphComponent,IGraph,ILayoutAlgorithm)">Online Documentation</a>
 * 
 * @property graphComponent
 * Gets the control this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23graphComponent">Online Documentation</a>
 * 
 * @property graph
 * Gets the graph this instance is working on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23graph">Online Documentation</a>
 * 
 * @property layout
 * Gets the [ILayoutAlgorithm] this instance is using.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23layout">Online Documentation</a>
 */
external open class LayoutExecutor  (
protected final val graphComponent: GraphComponent,
protected final val graph: IGraph,
protected final val layout: ILayoutAlgorithm) : YObject {
/**
 * Initializes a new instance of the [LayoutExecutor] class.
 * @param [graphComponent] The control which will be animated and provides the [IGraph] instance.
 * @param [layout] The [ILayoutAlgorithm] to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-constructor-LayoutExecutor(GraphComponent,ILayoutAlgorithm)">Online Documentation</a>
 */
 constructor( graphComponent: GraphComponent ,
 layout: ILayoutAlgorithm )

/**
 * Gets the [AbortHandler] that is used during the layout calculation, unless another [AbortHandler] has been configured via [layoutData] or by registering an [IMapper][yfiles.collections.IMapper] in the graph's [IGraph.mapperRegistry].
 * @see [createAbortHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23abortHandler">Online Documentation</a>
 */
final val abortHandler: AbortHandler
/**
 * Gets or sets a value indicating whether user interaction should be allowed during the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23allowUserInteraction">Online Documentation</a>
 */
final var allowUserInteraction: Boolean
/**
 * Gets or sets a value indicating whether the viewport should be animated to the new bounds of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23animateViewport">Online Documentation</a>
 */
final var animateViewport: Boolean
/**
 * Gets or sets a value indicating whether edge groups are automatically created for edges that are connected to the same port.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see [LayoutGraphAdapter.automaticEdgeGrouping]
 * @see [fixPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23automaticEdgeGrouping">Online Documentation</a>
 */
final var automaticEdgeGrouping: Boolean
/**
 * Gets or sets a value indicating whether to automatically perform calls to [TableLayoutConfigurator.prepare] and [TableLayoutConfigurator.restore] in order to layout table nodes.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23configureTableLayout">Online Documentation</a>
 */
final var configureTableLayout: Boolean
/**
 * Gets or sets a value indicating whether to respect the [CanvasComponent.viewportLimiter][yfiles.view.CanvasComponent.viewportLimiter] of the [GraphComponent] of this instance.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23considerViewportLimiter">Online Documentation</a>
 */
final var considerViewportLimiter: Boolean
/**
 * Gets or sets the duration of the animation.
 * 
 * The default value is [TimeSpan.ZERO].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23duration">Online Documentation</a>
 */
final var duration: TimeSpan
/**
 * Gets or sets a value indicating whether to use eased animation.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23easedAnimation">Online Documentation</a>
 */
final var easedAnimation: Boolean
/**
 * Gets or sets a value that controls whether strong port constraints are automatically created.
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see [LayoutGraphAdapter.fixPorts]
 * @see [automaticEdgeGrouping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23fixPorts">Online Documentation</a>
 */
final var fixPorts: Boolean
/**
 * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
 * @see [LayoutGraphAdapter.hideEdgesAtEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23hideEdgesAtEdges">Online Documentation</a>
 */
final var hideEdgesAtEdges: Boolean
/**
 * Gets or sets how [ILabel]s at [IEdge][yfiles.graph.IEdge]s should be placed by the layout algorithm.
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see [LayoutGraphAdapter.labelPreferredPlacementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23labelPreferredPlacementPolicy">Online Documentation</a>
 */
final var labelPreferredPlacementPolicy: LabelPreferredPlacementPolicy
/**
 * Gets or sets the layout data that is applied when [starting][start] the executor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23layoutData">Online Documentation</a>
 */
final var layoutData: LayoutData?
/**
 * Gets the layout graph that is used by this instance to calculate the layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23layoutGraph">Online Documentation</a>
 */
protected final val layoutGraph: CopiedLayoutGraph
/**
 * Gets or sets the policy that specifies how port locations should be adjusted after a layout has been calculated.
 * @see [PortCalculator]
 * @see [LayoutGraphAdapter.portAdjustmentPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23portAdjustmentPolicy">Online Documentation</a>
 */
final var portAdjustmentPolicy: PortAdjustmentPolicy
/**
 * Gets or sets how [ILabel]s at [IPort][yfiles.graph.IPort]s should be treated by the layout algorithm.
 * @see [PortLabelPolicy]
 * @see [LayoutGraphAdapter.portLabelPolicies]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23portLabelPolicies">Online Documentation</a>
 */
final var portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>
/**
 * Gets a value indicating whether this instance is currently running.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23running">Online Documentation</a>
 */
final val running: Boolean
/**
 * Gets or sets the [ISelectionModel] to use for the automatically registered [IDataProvider][yfiles.algorithms.IDataProvider] instances for [LayoutKeys.AFFECTED_NODES_DP_KEY] and [LayoutKeys.AFFECTED_EDGES_DP_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23selectionModel">Online Documentation</a>
 */
final var selectionModel: ISelectionModel<IModelItem>?
/**
 * Gets or sets a value indicating whether this instance waits for other instances to finish their operations before it executes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23sequentialExecution">Online Documentation</a>
 */
final var sequentialExecution: Boolean
/**
 * Gets the [tableLayoutConfigurator] that is used if [configureTableLayout] is enabled.
 * @see [createTableLayoutConfigurator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23tableLayoutConfigurator">Online Documentation</a>
 */
final val tableLayoutConfigurator: TableLayoutConfigurator
/**
 * Gets or sets the insets (in world coordinates) that will be added to the content rectangle when calculating the target viewport.
 * 
 * The default value is [Insets.EMPTY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23targetBoundsInsets">Online Documentation</a>
 */
final var targetBoundsInsets: Insets
/**
 * Gets or sets a value indicating whether the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] property of the [graphComponent] should be updated upon completion.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23updateContentRect">Online Documentation</a>
 */
final var updateContentRect: Boolean
/**
 * Creates an instance of [AbortHandler].
 * @return A new [AbortHandler] instance to use during layout calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createAbortHandler">Online Documentation</a>
 */
 open protected   fun createAbortHandler():AbortHandler
/**
 * Factory method that creates the [IAnimation] that will be used by this instance after the layout has been calculated.
 * @return The animation to use after the layout.
 * @see [duration]
 * @see [animateViewport]
 * @see [createMorphAnimation]
 * @see [createViewportAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createAnimation">Online Documentation</a>
 */
 open protected   fun createAnimation():IAnimation
/**
 * Creates the [LayoutGraphAdapter] which is used when a layout is [executed][start].
 * @return A preconfigured [LayoutGraphAdapter].
 * @see [LayoutGraphAdapter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createLayoutGraphAdapter">Online Documentation</a>
 */
 open protected   fun createLayoutGraphAdapter():LayoutGraphAdapter
/**
 * Factory method that creates the animation for the [IGraph].
 * @return The animation instance.
 * @see [createAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createMorphAnimation">Online Documentation</a>
 */
 open protected   fun createMorphAnimation():IAnimation
/**
 * Creates an animation that morphs the layout of all [ITable][yfiles.graph.ITable]s in the graph.
 * @see [TableAnimation][yfiles.view.TableAnimation]
 * @see [configureTableLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createTableAnimations">Online Documentation</a>
 */
 open protected   fun createTableAnimations():IAnimation
/**
 * Create a new instance of [TableLayoutConfigurator] that is used if [configureTableLayout] is enabled.
 * @return A new instance of the [TableLayoutConfigurator] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createTableLayoutConfigurator">Online Documentation</a>
 */
 open protected   fun createTableLayoutConfigurator():TableLayoutConfigurator
/**
 * Factory method that creates the animation for the [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport].
 * @param [targetBounds] The target bounds of the animation.
 * @return The animation instance.
 * @see [createAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createViewportAnimation">Online Documentation</a>
 */
 open protected   fun createViewportAnimation( targetBounds: Rect ):IAnimation
/**
 * Callback method that performs the actual layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-execute">Online Documentation</a>
 */
 open protected   fun execute()
/**
 * Calculate the target bounds to be used for the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] as well as the [ViewportAnimation][yfiles.view.ViewportAnimation] after the layout has finished.
 * @return The desired content rectangle and the bounds for a viewport animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-getTargetBounds">Online Documentation</a>
 */
 open protected   fun getTargetBounds():Rect
/**
 * Set up [tableLayoutConfigurator] for a layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-prepareTableLayout">Online Documentation</a>
 */
 open protected   fun prepareTableLayout()
/**
 * Writes the table layout information provided through [tableLayoutConfigurator] back to all tables.
 * @see [prepareTableLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-restoreTableLayout">Online Documentation</a>
 */
 open protected   fun restoreTableLayout()
/**
 * Actually starts the layout calculation and the optional animation asynchronously using a [Promise].
 * @return A [Promise] that will be fulfilled once the layout and optional animation is done.
 * @see [execute]
 * @see [createLayoutGraphAdapter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-start">Online Documentation</a>
 */
 open   fun start():Promise<Void>
/**
 * Stops a currently running layout calculation or animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-stop">Online Documentation</a>
 */
 final   fun stop():Promise<Void>

companion object : ClassMetadata<LayoutExecutor> {
}
}
