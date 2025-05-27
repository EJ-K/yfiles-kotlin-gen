// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLElement
import yfiles.graph.IGraph
import yfiles.input.OverviewInputMode
import yfiles.lang.ClassMetadata

/**
 * A specialized [CanvasComponent] that shows an overview of an [IGraph] contained in another [graphComponent][GraphOverviewComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent">Online Documentation</a>
 * 
 * @constructor Creates a new instance that is optionally bound to the provided [graphComponent][GraphOverviewComponent].
 * @param [graphComponent] The [graphComponent][GraphOverviewComponent] to bind this instance to. If omitted, the property needs to be set to initialize the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(GraphComponent)">Online Documentation</a>
 */
open external class GraphOverviewComponent (
  graphComponent: GraphComponent  = definedExternally,
) : CanvasComponent {
  /**
   * Creates a new instance of [GraphOverviewComponent] using the `HTMLElement` that is optionally bound to the provided [graphComponent][GraphOverviewComponent].
   * @param [htmlElement] The element to use for holding the canvas.
   * @param [graphComponent] The optional graph control to [bind][GraphOverviewComponent] this instance to. If omitted, the property needs to be set to initialize the component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(HTMLElement,GraphComponent)">Online Documentation</a>
   */ constructor(
    htmlElement: HTMLElement,
    graphComponent: GraphComponent  = definedExternally,
  )
  /**
   * Creates a new instance of [GraphOverviewComponent] using the `div` element that is specified by the `selector` and that is optionally bound to the provided [graphComponent][GraphOverviewComponent].
   * @param [selector] The CSS selector or id for an existing `div` element
   * @param [graphComponent] The [graphComponent][GraphOverviewComponent] to bind this instance to. If omitted, the property needs to be set to initialize the component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23GraphOverviewComponent-constructor-GraphOverviewComponent(string,GraphComponent)">Online Documentation</a>
   */ constructor(
    selector: String,
    graphComponent: GraphComponent  = definedExternally,
  )
  /**
   * Gets or sets the graph that is rendered in the overview.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graph">Online Documentation</a>
   */
  final var graph: IGraph?
  
  /**
   * Gets or sets the client control that will be used to retrieve the graph from and that will be used for navigating.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graphComponent">Online Documentation</a>
   */
  final var graphComponent: GraphComponent?
  
  /**
   * Gets or sets the [IObjectRenderer] that is used to render the overview.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23graphOverviewRenderer">Online Documentation</a>
   */
  final var graphOverviewRenderer: IObjectRenderer<IGraph>?
  
  /**
   * Gets or sets the [OverviewInputMode] that is used to navigate the client control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewComponent%23overviewInputMode">Online Documentation</a>
   */
  final var overviewInputMode: OverviewInputMode?
  
  companion object : ClassMetadata<GraphOverviewComponent> {
  }
}
