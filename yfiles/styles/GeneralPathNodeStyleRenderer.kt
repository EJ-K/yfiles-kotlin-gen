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
import yfiles.geometry.IRectangle
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.ILookup
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.ILassoTestable
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
 * An [INodeStyleRenderer] implementation that can handle [GeneralPathNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GeneralPathNodeStyleRenderer] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-constructor-GeneralPathNodeStyleRenderer">Online Documentation</a>
 */
external open class GeneralPathNodeStyleRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the currently configured node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode?
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: GeneralPathNodeStyle?
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns the aspect ratio with which the path is rendered.
 * @return Returns the aspect ratio with which the path is rendered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getAspectRatio">Online Documentation</a>
 */
 open protected   fun getAspectRatio():Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( node: INode ,
 style: INodeStyle ):IVisibilityTestable
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the [IVisualCreator] for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Determines visibility by checking for an intersection with the bounds of the [GeneralPathNodeStyle.path].
 * @param [context] The context.
 * @param [rectangle] The current clip
 * @return Whether the bounds of the [GeneralPathNodeStyle.path] are visible in the clip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyleRenderer%23GeneralPathNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GeneralPathNodeStyleRenderer> {
}
}
