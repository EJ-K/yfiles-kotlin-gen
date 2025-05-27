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
import web.html.HTMLDivElement
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Insets
import yfiles.graph.GraphClipboard
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.TimeSpan
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ItemMapping
import yfiles.layout.LabelPreferredPlacementPolicy
import yfiles.layout.LayoutData
import yfiles.layout.PortAdjustmentPolicy
import yfiles.layout.PortLabelPolicy

/**
 * A component for displaying and editing an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent()">Online Documentation</a>
 */
external open class GraphComponent  () : CanvasComponent {
/**
 * Creates a new instance of the [GraphComponent] in the given `div` element.
 * @param [div] The existing `div` element to use for rendering the canvas into. All its child nodes are added to the [CanvasComponent.overlayPanel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent(HTMLDivElement)">Online Documentation</a>
 */
 constructor( div: HTMLDivElement )
/**
 * Creates a new instance of [GraphComponent] using the `div` element that is specified by the `selector`.
 * @param [selector] The CSS selector or id for an existing `div` element. All child nodes of this element are added to the [CanvasComponent.overlayPanel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-constructor-GraphComponent(string)">Online Documentation</a>
 */
 constructor( selector: String )

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
 * Gets or sets the [focusIndicatorManager] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23focusIndicatorManager">Online Documentation</a>
 */
final var focusIndicatorManager: FocusIndicatorManager<IModelItem>
/**
 * Gets or sets the graph that is displayed in this control.
 * @see [createGraph]
 * @see [addGraphChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23graph">Online Documentation</a>
 */
final var graph: IGraph
/**
 * Gets or sets the [graphModelManager] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23graphModelManager">Online Documentation</a>
 */
final var graphModelManager: GraphModelManager
/**
 * Gets or sets the [highlightIndicatorManager] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23highlightIndicatorManager">Online Documentation</a>
 */
final var highlightIndicatorManager: HighlightIndicatorManager<IModelItem>
/**
 * Gets or sets the selection model that is used for this control.
 * @see [currentItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23selection">Online Documentation</a>
 */
final var selection: IGraphSelection
/**
 * Gets or sets the [selectionIndicatorManager] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23selectionIndicatorManager">Online Documentation</a>
 */
final var selectionIndicatorManager: SelectionIndicatorManager<IModelItem>
/**
 * Cleans up by removing any connection from the [CanvasComponent.div] element to the [GraphComponent] instance and any associated element that was created during the lifetime of the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * Factory method for the [focusIndicatorManager] property.
 * @return A new instance of [GraphFocusIndicatorManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createFocusIndicatorManager">Online Documentation</a>
 */
 open protected   fun createFocusIndicatorManager():FocusIndicatorManager<IModelItem>
/**
 * Factory method for the [graph] property.
 * @return a new instance of [DefaultGraph][yfiles.graph.DefaultGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createGraph">Online Documentation</a>
 */
 open protected   fun createGraph():IGraph
/**
 * Creates the default instance to use if no custom instance has been set.
 * @return A default [GraphClipboard] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createGraphClipboard">Online Documentation</a>
 */
 open protected   fun createGraphClipboard():GraphClipboard
/**
 * Factory method for the [graphModelManager] property.
 * @return a new instance of [GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createGraphModelManager">Online Documentation</a>
 */
 open protected   fun createGraphModelManager():GraphModelManager
/**
 * Factory method for the [highlightIndicatorManager] property.
 * @return A new instance of [GraphHighlightIndicatorManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createHighlightIndicatorManager">Online Documentation</a>
 */
 open protected   fun createHighlightIndicatorManager():HighlightIndicatorManager<IModelItem>
/**
 * Factory method for the [selection] property.
 * @return a new instance of [GraphSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createSelection">Online Documentation</a>
 */
 open protected   fun createSelection():IGraphSelection
/**
 * Factory method for the [selectionIndicatorManager] property.
 * @return A new instance of [GraphSelectionIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-createSelectionIndicatorManager">Online Documentation</a>
 */
 open protected   fun createSelectionIndicatorManager():SelectionIndicatorManager<IModelItem>
/**
 * [Updates the content rectangle][CanvasComponent.updateContentRect] for the [CanvasComponent.contentGroup] considering the provided insets and [adjusts the viewport to encompass the contents][CanvasComponent.fitContent].
 * @param [insets] The visible whitespace around the actual [CanvasComponent.contentRect].
 * @param [animated] Whether to change the viewport in an animated fashion.
 * @return A [Promise] that completes when the view port has been adjusted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-method-fitGraphBounds">Online Documentation</a>
 */
 open   fun fitGraphBounds( insets: Insets?  = definedExternally,
 animated: Boolean  = definedExternally):Promise<Void>
/**
 * Runs a layout on the [graph] of the [GraphComponent] and animates the transition.
 * @param [layout] The layout to run.
 * @param [morphDuration] The duration of the animation of the layout.
 * @param [layoutData] The layout data to apply.
 * @param [animateViewport] A value indicating whether the viewport should be animated to the new bounds of the graph.
 * @param [easedAnimation] A value indicating whether to use eased animation.
 * @param [updateContentRect] A value indicating whether the content rectangle property of the [CanvasComponent]
 * @param [allowUserInteraction] A value indicating whether user interaction should be allowed during the animation.
 * @param [automaticEdgeGrouping] A value indicating whether edge groups are automatically created for edges that are connected to the same port.
 * @param [configureTableLayout] A value indicating whether to automatically perform calls to [TableLayoutConfigurator.prepare][yfiles.layout.TableLayoutConfigurator.prepare] and [TableLayoutConfigurator.restore][yfiles.layout.TableLayoutConfigurator.restore] in order to layout table nodes.
 * @param [considerViewportLimiter] A value that controls whether strong port constraints are automatically created.
 * @param [fixPorts] A value that controls whether strong port constraints are automatically created.
 * @param [hideEdgesAtEdges] A value that controls whether edges at other edges will be hidden from the layout graph or included.
 * @param [portAdjustmentPolicy] The policy that specifies how port locations should be adjusted after a layout has been calculated.
 * @param [portLabelPolicies] Sets how [ILabel]s at [IPort][yfiles.graph.IPort]s should be treated by the layout algorithm.
 * @param [targetBoundsInsets] the insets (in world coordinates) that will be added to the content rectangle when calculating the target viewport.
 * @param [labelPreferredPlacementPolicy] The policy that specifies how edge labels should be treated by the layout algorithm.
 * @return A [Promise] that will resolve once the layout animation is finished.
 * @see [LayoutExecutor][yfiles.layout.LayoutExecutor]
 * @see [IGraph.applyLayout]
 * @see [YClass.ensure][yfiles.lang.YClass.ensure]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphComponent-defaultmethod-morphLayout">Online Documentation</a>
 */
   fun morphLayout( layout: ILayoutAlgorithm ,
 morphDuration: TimeSpan?  = definedExternally,
 layoutData: LayoutData?  = definedExternally,
 animateViewport: Boolean  = definedExternally,
 easedAnimation: Boolean  = definedExternally,
 updateContentRect: Boolean  = definedExternally,
 allowUserInteraction: Boolean  = definedExternally,
 automaticEdgeGrouping: Boolean  = definedExternally,
 configureTableLayout: Boolean  = definedExternally,
 considerViewportLimiter: Boolean  = definedExternally,
 fixPorts: Boolean  = definedExternally,
 hideEdgesAtEdges: Boolean  = definedExternally,
 portAdjustmentPolicy: PortAdjustmentPolicy  = definedExternally,
 portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>?  = definedExternally,
 targetBoundsInsets: Insets?  = definedExternally,
 labelPreferredPlacementPolicy: LabelPreferredPlacementPolicy  = definedExternally):Promise<Void>
/**
 * Occurs when the [currentItem] property has changed its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23CurrentItemChanged">Online Documentation</a>
 */
fun addCurrentItemChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)
fun removeCurrentItemChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)

/**
 * Occurs when the [graph] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphChanged">Online Documentation</a>
 */
fun addGraphChangedListener(listener: EventHandler1<ItemEventArgs<IGraph>>)
fun removeGraphChangedListener(listener: EventHandler1<ItemEventArgs<IGraph>>)

/**
 * Occurs if the [selection] instance has been changed, not when the selected items change.
 * @see [ISelectionModel.addItemSelectionChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23SelectionModelChanged">Online Documentation</a>
 */
fun addSelectionModelChangedListener(listener: EventHandler1<ItemEventArgs<IGraphSelection>>)
fun removeSelectionModelChangedListener(listener: EventHandler1<ItemEventArgs<IGraphSelection>>)

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
 * Occurs when the [currentItem] property has changed its value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23CurrentItemChanged">Online Documentation</a>
 */
inline fun  GraphComponent.addCurrentItemChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<PropertyChangedEventArgs> = { _, event -> handler(event.propertyName) }
    addCurrentItemChangedListener(listener)
    return { removeCurrentItemChangedListener(listener) }
}
/**
 * Occurs when the [graph] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23GraphChanged">Online Documentation</a>
 */
inline fun  GraphComponent.addGraphChangedHandler(
    crossinline handler: (item:IGraph) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IGraph>> = { _, event -> handler(event.item) }
    addGraphChangedListener(listener)
    return { removeGraphChangedListener(listener) }
}
/**
 * Occurs if the [selection] instance has been changed, not when the selected items change.
 * @see [ISelectionModel.addItemSelectionChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphComponent%23SelectionModelChanged">Online Documentation</a>
 */
inline fun  GraphComponent.addSelectionModelChangedHandler(
    crossinline handler: (item:IGraphSelection) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IGraphSelection>> = { _, event -> handler(event.item) }
    addSelectionModelChangedListener(listener)
    return { removeSelectionModelChangedListener(listener) }
}
