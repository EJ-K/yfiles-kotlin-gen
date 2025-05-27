// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import web.svg.SVGElement
import yfiles.geometry.GeneralPath
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.Font
import yfiles.view.HorizontalTextAlignment
import yfiles.view.IBoundsProvider
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator
import yfiles.view.TextWrapping
import yfiles.view.VerticalTextAlignment
import yfiles.view.Visual

/**
 * An [ILabelStyleRenderer] implementation that can handle [DefaultLabelStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer">Online Documentation</a>
 * 
 * @constructor Creates a new default instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-constructor-DefaultLabelStyleRenderer">Online Documentation</a>
 */
external open class DefaultLabelStyleRenderer  () : ILabelStyleRenderer, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets or sets the currently configured label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23label">Online Documentation</a>
 */
protected final var label: ILabel
/**
 * Gets or sets the current [layout][ILabel.layout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23layout">Online Documentation</a>
 */
protected final var layout: IOrientedRectangle
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: DefaultLabelStyle
/**
 * Add the text content to the provided SVG text element.
 * @param [textContainer] An SVG element to add the provided text to. It is a `SVGGElement` when using [CanvasComponent.rightToLeft][yfiles.view.CanvasComponent.rightToLeft], otherwise a `SVGTextElement`.
 * @param [font] The [Font] that defines the font properties to apply to the added text.
 * @param [text] The text content to add to the provided text element (may contain newline characters).
 * @param [maxSize] The bounds that shouldn't be exceeded when placing the text; `null` or not provided means unbound.
 * @param [wrapping] The [TextWrapping] policy to apply when the text exceeds the provided `maxSize`.
 * @param [rightToLeft] Whether to use right-to-left text direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-addTextElements">Online Documentation</a>
 */
 open protected   fun addTextElements( textContainer: SVGElement ,
 font: Font ,
 text: String ,
 maxSize: Size ,
 wrapping: TextWrapping ,
 rightToLeft: Boolean ):String
/**
 * Prepares this instance for subsequent calls after the style and label have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to retrieve the bounds provider for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( label: ILabel ,
 style: ILabelStyle ):IBoundsProvider
/**
 * Configures the `style` and `label` parameters, does **not** call [configure] and returns `this`.
 * @param [label] The label to query the context for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 style: ILabelStyle ):ILookup
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to query hit test with. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( label: ILabel ,
 style: ILabelStyle ):IHitTestable
/**
 * Determines how the text should be aligned within the assigned label bounds.
 * @return This value as obtained from the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getHorizontalTextAlignment">Online Documentation</a>
 */
 open protected   fun getHorizontalTextAlignment():HorizontalTextAlignment
/**
 * Configures the `style` and `label` parameters, calls [configure] and returns `this`.
 * @param [label] The label to query marquee intersection tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( label: ILabel ,
 style: ILabelStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getPreferredSize">Online Documentation</a>
 */
 final override   fun getPreferredSize( label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Calculates the preferred size given the current state of the renderer.
 * @return The size as suggested by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getPreferredSizeCore">Online Documentation</a>
 */
 open protected   fun getPreferredSizeCore():Size
/**
 * Returns a convex [GeneralPath] describing the area of the [DefaultLabelStyle.textWrappingShape] for the current [label] or `null` if the label's rectangular bounds should be used.
 * @return A convex [GeneralPath] describing the area of the [DefaultLabelStyle.textWrappingShape] or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getTextWrappingOutline">Online Documentation</a>
 */
 open protected   fun getTextWrappingOutline():GeneralPath?
/**
 * Determines how the text should be aligned vertically within the assigned label bounds.
 * @return This value as obtained from the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getVerticalTextAlignment">Online Documentation</a>
 */
 open protected   fun getVerticalTextAlignment():VerticalTextAlignment
/**
 * Configures the `style` and `label` parameters, does **not** call [configure] and returns `this`.
 * @param [label] The label to query visibility tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( label: ILabel ,
 style: ILabelStyle ):IVisualCreator
/**
 * Determines how the text should be trimmed to fit the assigned label bounds.
 * @return This value as obtained from the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-getWrapping">Online Documentation</a>
 */
 open protected   fun getWrapping():TextWrapping
/**
 * Delegates to [DefaultLabelStyle.autoFlip]
 * @return Whether to flip the drawing if it is upside down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-isAutoFlip">Online Documentation</a>
 */
 open protected   fun isAutoFlip():Boolean
/**
 * Determines whether text should be forced to be clipped inside the rectangle.
 * @return This value as obtained from the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-isClippingText">Online Documentation</a>
 */
 open protected   fun isClippingText():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * Uses the [ILabel.layout] to determine whether the clip intersects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Calculate the width and height required to render the provided text using the provided [Font].
 * @param [text] The text that should be measured.
 * @param [font] The [Font] to apply to the text before measuring.
 * @param [maximumSize] The maximum available size for the text.
 * @return The text size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-measureText">Online Documentation</a>
 */
 open protected   fun measureText( text: String ,
 font: Font ,
 maximumSize: Size ):Size
/**
 * Quantizes the result of the preferred size calculation.
 * @param [size] The preferred size
 * @return The quantized preferred size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-quantizePreferredSize">Online Documentation</a>
 */
 open protected   fun quantizePreferredSize( size: Size ):Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyleRenderer%23DefaultLabelStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<DefaultLabelStyleRenderer> {
}
}
