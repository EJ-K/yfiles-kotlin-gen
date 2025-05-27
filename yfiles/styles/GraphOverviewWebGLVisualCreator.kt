// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.view.IRenderContext
import yfiles.view.IVisualCreator
import yfiles.view.Visual

/**
 * An [IVisualCreator] for use in a [CanvasComponent][yfiles.view.CanvasComponent] that renders an [IGraph] instance in a sloppy overview style using WebGL.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewWebGLVisualCreator">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewWebGLVisualCreator%23GraphOverviewWebGLVisualCreator-constructor-GraphOverviewWebGLVisualCreator">Online Documentation</a>
 */
external open class GraphOverviewWebGLVisualCreator  ( graph: IGraph ) : IVisualCreator {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewWebGLVisualCreator%23GraphOverviewWebGLVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewWebGLVisualCreator%23GraphOverviewWebGLVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GraphOverviewWebGLVisualCreator> {
}
}
