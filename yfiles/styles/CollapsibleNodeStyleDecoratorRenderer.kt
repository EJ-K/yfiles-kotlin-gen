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
import yfiles.geometry.Size
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILookup
import yfiles.graph.INode
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
import yfiles.view.SvgVisual
import yfiles.view.Visual

/**
 * [INodeStyleRenderer] implementation that can be used in conjunction with [CollapsibleNodeStyleDecorator] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [CollapsibleNodeStyleDecoratorRenderer] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-constructor-CollapsibleNodeStyleDecoratorRenderer">Online Documentation</a>
 */
external open class CollapsibleNodeStyleDecoratorRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the currently configured node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23style">Online Documentation</a>
 */
protected final var style: CollapsibleNodeStyleDecorator
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the button visual.
 * @param [context] The context.
 * @param [expanded] Specifies whether the button visual is created for the expanded or the collapsed state.
 * @param [size] The button size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-createButton">Online Documentation</a>
 */
 open protected   fun createButton( context: IRenderContext ,
 expanded: Boolean ,
 size: Size ):SvgVisual
/**
 * Creates the visual for the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Delegates to the [getWrappedStyle] and takes the button into account.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Yields the [CollapsibleNodeStyleDecorator.buttonPlacement] for the current [style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getButtonLocationParameter">Online Documentation</a>
 */
 open protected   fun getButtonLocationParameter():ILabelModelParameter
/**
 * Returns the size of new buttons.
 * @return The size of new buttons
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getButtonSize">Online Documentation</a>
 */
 open protected   fun getButtonSize():Size
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * Delegates to the [getWrappedStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * Delegates to the [getWrappedStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getVisibilityTestable">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * Yields the [CollapsibleNodeStyleDecorator.wrapped] property for the current [style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-getWrappedStyle">Online Documentation</a>
 */
 open protected   fun getWrappedStyle():INodeStyle
/**
 * Delegates to the [getWrappedStyle] and checks the button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Delegates to the [getWrappedStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * Delegates to the [getWrappedStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Delegates to the [getWrappedStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Updates the button visual.
 * @param [context] The context.
 * @param [expanded] Specifies whether the button visual is updated for the expanded or the collapsed state.
 * @param [size] The button size.
 * @param [oldButton] The old button visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-updateButton">Online Documentation</a>
 */
 open protected   fun updateButton( context: IRenderContext ,
 expanded: Boolean ,
 size: Size ,
 oldButton: Visual? ):SvgVisual
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<CollapsibleNodeStyleDecoratorRenderer> {
/**
 * Adds the toggle expansion state command to the given button visual.
 * @param [button] The button visual to add the event listeners to.
 * @param [currentNode] The group node whose state is to be toggled.
 * @param [context] The context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecoratorRenderer%23CollapsibleNodeStyleDecoratorRenderer-method-addToggleExpansionStateCommand">Online Documentation</a>
 */
 final   fun addToggleExpansionStateCommand( button: SvgVisual ,
 currentNode: INode ,
 context: IRenderContext )
}
}
