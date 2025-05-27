// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import js.promise.Promise
import web.html.HTMLElement
import yfiles.collections.IObservableCollection
import yfiles.collections.ItemEventArgs
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.graph.GraphClipboard
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.EventHandler1
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.TimeSpan
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LabelPlacementPolicy
import yfiles.layout.LayoutAnchoringPolicy
import yfiles.layout.LayoutData
import yfiles.layout.PortAdjustmentPolicy
import yfiles.layout.PortLabelPolicy
import yfiles.layout.PortPlacementPolicy

/**
 * A component for displaying and editing an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent()">Online Documentation</a>
 */
open external class GraphComponent () : CanvasComponent {
  /**
   * Creates a new instance of the [GraphComponent] in the given `div` element.
   * @param [htmlElement] The existing `div` element to use for rendering the canvas into. All its child nodes are added to the [overlayPanel][CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent(HTMLElement)">Online Documentation</a>
   */ constructor(
    htmlElement: HTMLElement,
  )
  /**
   * Creates a new instance of [GraphComponent] using the `div` element that is specified by the `selector`.
   * @param [selector] The CSS selector or id for an existing `div` element. All child nodes of this element are added to the [overlayPanel][CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent(string)">Online Documentation</a>
   */ constructor(
    selector: String,
  )
  /**
   * Gets or sets the [GraphClipboard] associated with this control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23clipboard">Online Documentation</a>
   */
  final var clipboard: GraphClipboard
  
  /**
   * Gets or sets the currently focused item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23currentItem">Online Documentation</a>
   */
  final var currentItem: IModelItem?
  
  /**
   * Gets or sets the [FocusIndicatorManager] that manages display of the focus indicator for keyboard operations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23focusIndicatorManager">Online Documentation</a>
   */
  final var focusIndicatorManager: FocusIndicatorManager<IModelItem>
  
  /**
   * Gets or sets the graph that is displayed in this control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23graph">Online Documentation</a>
   */
  final var graph: IGraph
  
  /**
   * Gets or sets the [graphModelManager][GraphComponent] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23graphModelManager">Online Documentation</a>
   */
  final var graphModelManager: GraphModelManager
  
  /**
   * Gets or sets the [HighlightIndicatorManager] which is responsible for rendering the highlights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23highlightIndicatorManager">Online Documentation</a>
   */
  final var highlightIndicatorManager: HighlightIndicatorManager<IModelItem>
  
  /**
   * Gets or sets the collection model that stores the highlight state for the visualization.
   * @see [selection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23highlights">Online Documentation</a>
   */
  final var highlights: IObservableCollection<IModelItem>
  
  /**
   * Gets or sets the selection model that stores the selection state for the visualization.
   * @see [currentItem]
   * @see [highlights]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23selection">Online Documentation</a>
   */
  final var selection: IGraphSelection
  
  /**
   * Gets or sets the [selectionIndicatorManager][GraphComponent] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23selectionIndicatorManager">Online Documentation</a>
   */
  final var selectionIndicatorManager: SelectionIndicatorManager<IModelItem>
  
  /**
   * Runs a layout on the [graph][GraphComponent] of the [GraphComponent] and animates the transition.
   * @param [layout] The layout to run.
   * @param [animationDuration] The duration of the animation. The default value is 0.5 seconds.
   * @param [layoutData] The layout data to apply.
   * @param [stopDuration] the maximum runtime for the layout calculation before it is automatically stopped.
   * @param [cancelDuration] the maximum runtime for the layout calculation before it is automatically canceled.
   * @param [animateViewport] A value indicating whether the viewport should be animated to the new bounds of the graph.
   * @param [portAdjustmentPolicies] The policy that specifies how port locations should be adjusted after a layout has been calculated.
   * @param [portPlacementPolicies] The policy that specifies how ports should be placed by the layout algorithm.
   * @param [portLabelPolicies] Sets how [ILabel]s at [IPort]s should be treated by the layout algorithm.
   * @param [anchoredItems] Specifies which part of the items should be used to anchor the graph during layout.
   * @param [targetBoundsPadding] The insets (in world coordinates) that will be added to the content rectangle when calculating the target viewport.
   * @param [labelPlacementPolicies] Sets how [ILabel]s should be placed by the layout algorithm.
   * @param [nodeComparator] A comparison function that normalizes the order of the nodes for the layout calculation to ensure the same order for multiple layout invocations.
   * @param [edgeComparator] A comparison function that normalizes the order of the edges for the layout calculation to ensure the same order for multiple layout invocations.
   * @return A [Promise] that will resolve once the layout animation is finished.
   * @see [LayoutExecutor][yfiles.layout.LayoutExecutor]
   * @see [IGraph.applyLayout]
   * @see [LayoutExecutor.ensure][yfiles.layout.LayoutExecutor.ensure]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-defaultmethod-applyLayoutAnimated">Online Documentation</a>
   */
  fun applyLayoutAnimated(
    layout: ILayoutAlgorithm,
    animationDuration: TimeSpan  = definedExternally,
    layoutData: LayoutData<INode, IEdge, ILabel, ILabel>  = definedExternally,
    stopDuration: TimeSpan  = definedExternally,
    cancelDuration: TimeSpan  = definedExternally,
    animateViewport: Boolean  = definedExternally,
    portAdjustmentPolicies: ItemMapping<IPort, PortAdjustmentPolicy>  = definedExternally,
    portPlacementPolicies: ItemMapping<IPort, PortPlacementPolicy>  = definedExternally,
    portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>  = definedExternally,
    anchoredItems: ItemMapping<IModelItem, LayoutAnchoringPolicy>  = definedExternally,
    targetBoundsPadding: Insets  = definedExternally,
    labelPlacementPolicies: ItemMapping<ILabel, LabelPlacementPolicy>  = definedExternally,
    nodeComparator: Comparison1<INode>  = definedExternally,
    edgeComparator: Comparison1<IEdge>  = definedExternally,
  ): Promise<Void>
  
  /**
   * Cleans up by removing any connection from the [htmlElement][CanvasComponent] element to the [GraphComponent] instance and any associated element that was created during the lifetime of the component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-cleanUp">Online Documentation</a>
   */
  override fun cleanUp()
  
  /**
   * [Updates the content bounds][CanvasComponent] for the [contentGroup][RenderTree] considering the provided margins and [adjusts the viewport to encompass the contents][CanvasComponent].
   * @param [margins] The visible whitespace around the actual [contentBounds][CanvasComponent].
   * @param [animated] Whether to change the viewport in an animated fashion.
   * @return A [Promise] that completes when the viewport has been adjusted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-fitGraphBounds">Online Documentation</a>
   */
  open fun fitGraphBounds(
    margins: Insets?  = definedExternally,
    animated: Boolean  = definedExternally,
  ): Promise<Void>
  
  companion object : ClassMetadata<GraphComponent> {
  }
}

inline fun GraphComponent(
    block: GraphComponent.() -> Unit
): GraphComponent {
    return GraphComponent()
        .apply(block)
}

inline operator fun <T : GraphComponent> T.invoke(
    block: T.() -> Unit
): T = apply(block)

/**
 * `current-item-changed`: Occurs when the [currentItem][GraphComponent] property has changed its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23current-item-changed">Online Documentation</a>
 */
inline fun  GraphComponent.addCurrentItemChangedHandler(
  crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<PropertyChangedEventArgs> = { event, _ -> handler(event.propertyName) }
  addEventListener("current-item-changed", listener)
  return { removeEventListener("current-item-changed", listener) }
}

/**
 * `selection-model-changed`: Occurs if the [selection][GraphComponent] instance has been changed, not when the selected items change.
 * @see [IObservableCollection.addItemAddedHandler]
 * @see [IObservableCollection.addItemRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23selection-model-changed">Online Documentation</a>
 */
inline fun  GraphComponent.addSelectionModelChangedHandler(
  crossinline handler: (item:IGraphSelection) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IGraphSelection>> = { event, _ -> handler(event.item) }
  addEventListener("selection-model-changed", listener)
  return { removeEventListener("selection-model-changed", listener) }
}
