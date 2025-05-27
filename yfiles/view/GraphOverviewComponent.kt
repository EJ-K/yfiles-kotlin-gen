// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLDivElement
import yfiles.graph.IGraph
import yfiles.input.OverviewInputMode
import yfiles.lang.ClassMetadata

/**
 * A specialized [CanvasComponent] that shows an overview of an [IGraph] contained in another [graphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent">Online Documentation</a>
 * 
 * @constructor Creates a new instance that is optionally bound to the provided [graphComponent].
 * @param [graphComponent] The [graphComponent] to bind this instance to. If omitted, the property needs to be set to initialize the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(GraphComponent)">Online Documentation</a>
 */
external open class GraphOverviewComponent  ( graphComponent: GraphComponent?  = definedExternally) : CanvasComponent {
/**
 * Creates a new instance of [GraphOverviewComponent] using the `div` element that is optionally bound to the provided [graphComponent].
 * @param [div] The div element to use for holding the canvas.
 * @param [graphComponent] The optional graph control to [bind][graphComponent] this instance to. If omitted, the property needs to be set to initialize the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(HTMLDivElement,GraphComponent)">Online Documentation</a>
 */
 constructor( div: HTMLDivElement ,
 graphComponent: GraphComponent?  = definedExternally)
/**
 * Creates a new instance of [GraphOverviewComponent] using the `div` element that is specified by the `selector` and that is optionally bound to the provided [graphComponent].
 * @param [selector] The CSS selector or id for an existing `div` element
 * @param [graphComponent] The [graphComponent] to bind this instance to. If omitted, the property needs to be set to initialize the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(string,GraphComponent)">Online Documentation</a>
 */
 constructor( selector: String ,
 graphComponent: GraphComponent?  = definedExternally)

/**
 * Gets or sets the graph that is rendered in the overview.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graph">Online Documentation</a>
 */
final var graph: IGraph?
/**
 * Gets or sets the client component, that will be used to retrieve the graph from and that will be used for navigating.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graphComponent">Online Documentation</a>
 */
final var graphComponent: GraphComponent?
/**
 * Gets or sets the [GraphOverviewSvgVisualCreator][yfiles.styles.GraphOverviewSvgVisualCreator] that is used to render the overview.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graphVisualCreator">Online Documentation</a>
 */
final var graphVisualCreator: IVisualCreator?
/**
 * Gets or sets the [OverviewInputMode] that is used to navigate the client control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23overviewInputMode">Online Documentation</a>
 */
final var overviewInputMode: OverviewInputMode?
/**
 * Gets or sets the rendering technology used to draw the graph items in the overview component.
 * 
 * The default is [RenderModes.CANVAS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23renderMode">Online Documentation</a>
 */
final var renderMode: RenderModes
/**
 * Prevents cursor modification from Projection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-compensateCursorForProjection">Online Documentation</a>
 */
 override   fun compensateCursorForProjection( cursor: Cursor? ):Cursor?
/**
 * Factory method that creates the [IVisualCreator] that renders the preview of the graph in a HTML canvas element.
 * @param [graph] The graph to draw.
 * @return An [IVisualCreator] that creates HTML canvas rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-createCanvasVisualCreator">Online Documentation</a>
 */
 open protected   fun createCanvasVisualCreator( graph: IGraph ):IVisualCreator
/**
 * Factory method that creates the [IVisualCreator] that renders the preview of the graph in SVG.
 * @param [graph] The graph to draw.
 * @return An [IVisualCreator] that creates SVG.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-createSvgVisualCreator">Online Documentation</a>
 */
 open protected   fun createSvgVisualCreator( graph: IGraph ):IVisualCreator
/**
 * Factory method that creates the [IVisualCreator] that renders the preview of the graph in a WebGL2 canvas element.
 * @param [graph] The graph to draw.
 * @return An [IVisualCreator] that creates WebGL2 canvas rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-createWebGL2VisualCreator">Online Documentation</a>
 */
 open protected   fun createWebGL2VisualCreator( graph: IGraph ):IVisualCreator
/**
 * Factory method that creates the [IVisualCreator] that renders the preview of the graph in a WebGL canvas element.
 * @param [graph] The graph to draw.
 * @return An [IVisualCreator] that creates WebGL canvas rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-createWebGLVisualCreator">Online Documentation</a>
 */
 open protected   fun createWebGLVisualCreator( graph: IGraph ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-method-raiseUpdatingVisualEvent">Online Documentation</a>
 */
 override   fun raiseUpdatingVisualEvent()

companion object : ClassMetadata<GraphOverviewComponent> {
}
}
