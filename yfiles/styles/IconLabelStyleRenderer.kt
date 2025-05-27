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
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILookup
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
 * An [ILabelStyleRenderer] that can handle [IconLabelStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-constructor-IconLabelStyleRenderer">Online Documentation</a>
 */
external open class IconLabelStyleRenderer  () : ILabelStyleRenderer, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets or sets the currently configured label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23label">Online Documentation</a>
 */
protected final var label: ILabel
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: IconLabelStyle
/**
 * Prepares this instance for subsequent calls after the style and label have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to retrieve the bounds provider for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( label: ILabel ,
 style: ILabelStyle ):IBoundsProvider
/**
 * Configures the `style` and `label` parameters, does **not** call [configure] and returns `this`.
 * @param [label] The label to query the context for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 style: ILabelStyle ):ILookup
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to query hit test with. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( label: ILabel ,
 style: ILabelStyle ):IHitTestable
/**
 * Retrieves the [IconLabelStyle.icon] from the [style].
 * @return The icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getIcon">Online Documentation</a>
 */
 open protected   fun getIcon():String?
/**
 * Retrieves the [IconLabelStyle.iconPlacement] from the [style].
 * @return The placement parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getIconPlacement">Online Documentation</a>
 */
 open protected   fun getIconPlacement():ILabelModelParameter
/**
 * Gets the size of the icon from the [IconLabelStyle.iconSize] property.
 * @return The size to use for the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getIconSize">Online Documentation</a>
 */
 open protected   fun getIconSize():Size
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to query marquee intersection tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( label: ILabel ,
 style: ILabelStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getPreferredSize">Online Documentation</a>
 */
 final override   fun getPreferredSize( label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Calculates the preferred size given the current state of the renderer.
 * @return The size as suggested by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getPreferredSizeCore">Online Documentation</a>
 */
 open protected   fun getPreferredSizeCore():Size
/**
 * Configures the `style` and `label` parameters, does **not** call [configure] and returns `this`.
 * @param [label] The label to query visibility tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( label: ILabel ,
 style: ILabelStyle ):IVisibilityTestable
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to retrieve the [IVisualCreator] for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( label: ILabel ,
 style: ILabelStyle ):IVisualCreator
/**
 * Retrieves the [IconLabelStyle.wrapped] from the [style].
 * @return The style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getWrappedStyle">Online Documentation</a>
 */
 open protected   fun getWrappedStyle():ILabelStyle
/**
 * Retrieves the [IconLabelStyle.wrappedInsets] from the [style].
 * @return The insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-getWrappedStyleInsets">Online Documentation</a>
 */
 open protected   fun getWrappedStyleInsets():Insets
/**
 * Retrieves the [IconLabelStyle.autoFlip] property from the [style].
 * @return The autoflip property value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-isAutoFlip">Online Documentation</a>
 */
 open protected   fun isAutoFlip():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-isInPath">Online Documentation</a>
 */
 final override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Returns whether the icon bounds should be considered for hit testing.
 * @return true
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-shouldHitTestIcon">Online Documentation</a>
 */
 open protected   fun shouldHitTestIcon():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyleRenderer%23IconLabelStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<IconLabelStyleRenderer> {
}
}
