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
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.TimeSpan
import yfiles.view.GraphComponent
import yfiles.view.IAnimation

/**
 * Executes a [ILayoutAlgorithm] and optionally animates the transition to the calculated layout.
 * @see [LayoutExecutorAsync]
 * @see [LayoutGraphAdapter]
 * @see [GraphComponent.applyLayoutAnimated]
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
open external class LayoutExecutor (
protected final val graphComponent: GraphComponent,
protected final val graph: IGraph,
protected final val layout: ILayoutAlgorithm)  {
  /**
   * Initializes a new instance of the [LayoutExecutor] class.
   * @param [graphComponent] The control which will be animated and provides the [IGraph] instance.
   * @param [layout] The [ILayoutAlgorithm] to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-constructor-LayoutExecutor(GraphComponent,ILayoutAlgorithm)">Online Documentation</a>
   */ constructor(
    graphComponent: GraphComponent,
    layout: ILayoutAlgorithm,
  )
  /**
   * Gets the layout graph adapter that is used by this instance to calculate the layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23adapter">Online Documentation</a>
   */
  final val adapter: LayoutGraphAdapter?
  
  /**
   * Gets or sets a value indicating whether user interaction should be allowed during the animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23allowUserInteraction">Online Documentation</a>
   */
  final var allowUserInteraction: Boolean
  
  /**
   * Gets or sets the mapping of graph items to [LayoutAnchoringPolicy] values, specifying which part of the items should be used to anchor the graph during layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23anchoredItems">Online Documentation</a>
   */
  final var anchoredItems: ItemMapping<IModelItem, LayoutAnchoringPolicy>
  
  /**
   * Gets or sets a value indicating whether the viewport should be animated to the new bounds of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23animateViewport">Online Documentation</a>
   */
  final var animateViewport: Boolean
  
  /**
   * Gets or sets the duration of the animation.
   * 
   * The default value is [ZERO][TimeSpan].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23animationDuration">Online Documentation</a>
   */
  final var animationDuration: TimeSpan
  
  /**
   * Gets or sets the maximum runtime for the layout calculation before it is automatically canceled.
   * @throws ArgumentError if the duration is negative
   * @see [LayoutAbortController.cancelDuration]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23cancelDuration">Online Documentation</a>
   */
  open var cancelDuration: TimeSpan
  
  /**
   * Gets or sets a value indicating whether to automatically perform calls to [prepare][TableLayoutConfigurator] and [restore][TableLayoutConfigurator] in order to layout table nodes.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23configureTableLayout">Online Documentation</a>
   */
  final var configureTableLayout: Boolean
  
  /**
   * Gets or sets a value indicating whether to respect the [viewportLimiter][yfiles.view.CanvasComponent] of the [GraphComponent] of this instance.
   * 
   * The default value is `true`, but as updating the layout typically also [updates][LayoutExecutor] the [contentBounds][yfiles.view.CanvasComponent], depending on the [ViewportLimiter][yfiles.view.ViewportLimiter] implementation and configuration, this could be set to `false`, instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23considerViewportLimiter">Online Documentation</a>
   */
  final var considerViewportLimiter: Boolean
  
  /**
   * Gets or sets a value indicating whether to use eased animation.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23easedAnimation">Online Documentation</a>
   */
  final var easedAnimation: Boolean
  
  /**
   * Gets or sets a comparison function that normalizes the order of the edges for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [nodeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23edgeComparator">Online Documentation</a>
   */
  final var edgeComparator: Comparison1<IEdge>?
  
  /**
   * Gets or sets a value that controls whether edges at other edges will be hidden from the layout graph or included.
   * @see [LayoutGraphAdapter.hideEdgesAtEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23hideEdgesAtEdges">Online Documentation</a>
   */
  final var hideEdgesAtEdges: Boolean
  
  /**
   * Gets or sets a mapping that specifies how [ILabel]s should be placed by the layout algorithm.
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see [LayoutGraphAdapter.labelPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23labelPlacementPolicies">Online Documentation</a>
   */
  final var labelPlacementPolicies: ItemMapping<ILabel, LabelPlacementPolicy>
  
  /**
   * Gets or sets the layout data that is applied when [starting][LayoutExecutor] the executor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23layoutData">Online Documentation</a>
   */
  final var layoutData: LayoutData<INode, IEdge, ILabel, ILabel>?
  
  /**
   * Gets or sets a comparison function that normalizes the order of the nodes for the layout calculation to ensure the same order for multiple layout invocations.
   * @see [edgeComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23nodeComparator">Online Documentation</a>
   */
  final var nodeComparator: Comparison1<INode>?
  
  /**
   * Gets or sets the mapping from ports to a policy that specifies how port locations should be adjusted after a layout has been calculated.
   * @see [LayoutGraphAdapter.portAdjustmentPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23portAdjustmentPolicies">Online Documentation</a>
   */
  final var portAdjustmentPolicies: ItemMapping<IPort, PortAdjustmentPolicy>
  
  /**
   * Gets or sets how [ILabel]s at [IPort]s should be treated by the layout algorithm.
   * @see [PortLabelPolicy]
   * @see [LayoutGraphAdapter.portLabelPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23portLabelPolicies">Online Documentation</a>
   */
  final var portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>
  
  /**
   * Gets or sets a mapping that specifies how [IPort]s should be placed by the layout algorithm.
   * @see [EdgePortCandidates.SOURCE_PORT_CANDIDATES_DATA_KEY]
   * @see [EdgePortCandidates.TARGET_PORT_CANDIDATES_DATA_KEY]
   * @see [NodePortCandidates.NODE_PORT_CANDIDATES_DATA_KEY]
   * @see [LayoutGraphAdapter.portPlacementPolicies]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23portPlacementPolicies">Online Documentation</a>
   */
  final var portPlacementPolicies: ItemMapping<IPort, PortPlacementPolicy>
  
  /**
   * Gets a value indicating whether this instance is currently running.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23running">Online Documentation</a>
   */
  final val running: Boolean
  
  /**
   * Gets or sets a value indicating whether this instance waits for other instances to finish their operations before it executes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23sequentialExecution">Online Documentation</a>
   */
  final var sequentialExecution: Boolean
  
  /**
   * Gets or sets the maximum runtime for the layout calculation before it is automatically stopped.
   * @throws ArgumentError if the duration is negative
   * @see [LayoutAbortController.stopDuration]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23stopDuration">Online Documentation</a>
   */
  open var stopDuration: TimeSpan
  
  /**
   * Gets the [tableLayoutConfigurator][LayoutExecutor] that is used if [configureTableLayout][LayoutExecutor] is enabled.
   * @see [createTableLayoutConfigurator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23tableLayoutConfigurator">Online Documentation</a>
   */
  final val tableLayoutConfigurator: TableLayoutConfigurator
  
  /**
   * Gets or sets the padding (in world coordinates) that will be added to the content bounds when calculating the target viewport.
   * 
   * The default value is [EMPTY][Insets].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23targetBoundsPadding">Online Documentation</a>
   */
  final var targetBoundsPadding: Insets
  
  /**
   * Gets or sets a value indicating whether the [contentBounds][yfiles.view.CanvasComponent] property of the [graphComponent][LayoutExecutor] should be updated upon completion.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23updateContentBounds">Online Documentation</a>
   */
  final var updateContentBounds: Boolean
  
  /**
   * Factory method that creates the [IAnimation] that will be used by this instance after the layout has been calculated.
   * @return The animation to use after the layout.
   * @see [animationDuration]
   * @see [animateViewport]
   * @see [createLayoutAnimation]
   * @see [createViewportAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createAnimation">Online Documentation</a>
   */
  protected open fun createAnimation(): IAnimation
  
  /**
   * Factory method that creates the animation for the [IGraph].
   * @return The animation instance.
   * @see [createAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createLayoutAnimation">Online Documentation</a>
   */
  protected open fun createLayoutAnimation(): IAnimation
  
  /**
   * Creates the [LayoutGraphAdapter] which is used when a layout is [executed][LayoutExecutor].
   * @return A preconfigured [LayoutGraphAdapter].
   * @see [LayoutGraphAdapter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createLayoutGraphAdapter">Online Documentation</a>
   */
  protected open fun createLayoutGraphAdapter(): LayoutGraphAdapter
  
  /**
   * Creates an animation that transitions the layout of all [ITable][yfiles.graph.ITable]s in the graph.
   * @return An animation that transitions the layout of all [ITable][yfiles.graph.ITable]s in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createTableAnimations">Online Documentation</a>
   */
  protected open fun createTableAnimations(): IAnimation
  
  /**
   * Create a new instance of [TableLayoutConfigurator] that is used if [configureTableLayout][LayoutExecutor] is enabled.
   * @return A new instance of the [TableLayoutConfigurator] class.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createTableLayoutConfigurator">Online Documentation</a>
   */
  protected open fun createTableLayoutConfigurator(): TableLayoutConfigurator
  
  /**
   * Factory method that creates the animation for the [viewport][yfiles.view.CanvasComponent].
   * @param [targetBounds] The target bounds of the animation.
   * @return The animation instance.
   * @see [createAnimation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-createViewportAnimation">Online Documentation</a>
   */
  protected open fun createViewportAnimation(
    targetBounds: Rect,
  ): IAnimation
  
  /**
   * Callback method that performs the actual layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-execute">Online Documentation</a>
   */
  protected open fun execute()
  
  /**
   * Calculate the target bounds to be used for the [contentBounds][yfiles.view.CanvasComponent] as well as the [ViewportAnimation][yfiles.view.ViewportAnimation] after the layout has finished.
   * @return The desired content bounds and the bounds for a viewport animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-getTargetBounds">Online Documentation</a>
   */
  protected open fun getTargetBounds(): Rect
  
  /**
   * Uses [tableLayoutConfigurator][LayoutExecutor] to prepare a [LayoutGridData] for the layout.
   * @return The configured [LayoutGridData] instance that's applied to the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-prepareTableLayout">Online Documentation</a>
   */
  protected open fun prepareTableLayout(): LayoutGridData<INode, IEdge, ILabel, ILabel>?
  
  /**
   * Writes the table layout information provided through [tableLayoutConfigurator][LayoutExecutor] back to all tables.
   * @see [prepareTableLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-restoreTableLayout">Online Documentation</a>
   */
  protected open fun restoreTableLayout()
  
  /**
   * Actually starts the layout calculation and the optional animation asynchronously using a [Promise].
   * @return A [Promise] that will be fulfilled once the layout and optional animation is done.
   * @see [execute]
   * @see [createLayoutGraphAdapter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-start">Online Documentation</a>
   */
  open fun start(): Promise<Void>
  
  /**
   * Stops a currently running layout calculation or animation.
   * @return A promise that will resolve once the layout calculation or animation is stopped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-stop">Online Documentation</a>
   */
  fun stop(): Promise<Void>
  
  companion object : ClassMetadata<LayoutExecutor> {
    /**
     * Makes sure the [LayoutExecutor] code is not stripped by build optimizations like tree shaking.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutExecutor%23LayoutExecutor-method-ensure">Online Documentation</a>
     */
    fun ensure()
  }
}
