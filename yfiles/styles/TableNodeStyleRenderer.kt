// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.ILookup
import yfiles.graph.INode
import yfiles.graph.ITable
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IBoundsProvider
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator
import yfiles.view.Visual

/**
 * Default renderer implementation that can be used for [TableNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer">Online Documentation</a>
 */
external open class TableNodeStyleRenderer  : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets or sets the currently configured node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TableNodeStyle
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Get the [background style][INodeStyle] that is currently used by this renderer.
 * @return The [background style][INodeStyle] that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getBackgroundStyle">Online Documentation</a>
 */
 open protected   fun getBackgroundStyle():INodeStyle?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Gets the table object that should be used for rendering.
 * @return The table that should be used for the rendering process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getTable">Online Documentation</a>
 */
 open protected   fun getTable():ITable?
/**
 * Get the [TableRenderingOrder] that is currently used by this renderer.
 * @return The [TableRenderingOrder] that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getTableRenderingOrder">Online Documentation</a>
 */
 open protected   fun getTableRenderingOrder():TableRenderingOrder
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( node: INode ,
 style: INodeStyle ):IVisibilityTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyleRenderer%23TableNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<TableNodeStyleRenderer> {
}
}
