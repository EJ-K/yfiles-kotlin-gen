// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable
import yfiles.view.Color
import yfiles.view.Fill
import yfiles.view.IBoundsProvider
import yfiles.view.IVisualCreator
import yfiles.view.Stroke

/**
 * A default implementation of the [IArrow] interface that can render [ArrowType]s.
 * 
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * The strings applying to this scheme are converted to [Arrow]s:
 * <pre class="programlisting">`'[color] [scale] type'
 * 
 * color = CSS color strings
 * scale = xx-small|x-small|small|medium|large|x-large|xx-large
 * type = normal|none|stealth|open|diamond|cross|circle|ball|ellipse|triangle|chevron|deltoid|kite
 * ```
 * Valid color strings are the same as for [Color]. Square brackets mark optional declarations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow">Online Documentation</a>
 * 
 * @constructor Creates a new arrow in the given `color`.
 * @param [type] The [ArrowType] describing the shape of the arrow.
 * @param [color] The [Color] used to render the arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-constructor-Arrow(ArrowType,Color)">Online Documentation</a>
 */
external class Arrow (
  type: ArrowType,
  color: Color,
) : IArrow, ICloneable<Arrow> {
  /**
   * Creates a new arrow.
   * @param [type] The [ArrowType] describing the shape of the arrow.
   * @param [fill] The [fill][Arrow] used to fill the arrow shape. The default is `null`.
   * @param [stroke] The [stroke][Arrow] used to render the arrow outline. The default is `null`.
   * @param [lengthScale] The scale factor for the arrow length. The default is 1.0.
   * @param [widthScale] The scale factor for the arrow width. The default is 1.0.
   * @param [cropLength] The additional length by which the edge is cropped. The default is 0.0.
   * @param [cropAtPort] Whether the edge should end at the port instead of the node shape. The default is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-constructor-Arrow(ArrowType,Fill,Stroke,number,number,number,boolean)">Online Documentation</a>
   */ constructor(
    type: ArrowType,
    fill: Fill?  = definedExternally,
    stroke: Stroke?  = definedExternally,
    lengthScale: Double  = definedExternally,
    widthScale: Double  = definedExternally,
    cropLength: Double  = definedExternally,
    cropAtPort: Boolean  = definedExternally,
  )
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23cropAtPort">Online Documentation</a>
   */
  final override val cropAtPort: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23cropLength">Online Documentation</a>
   */
  final override val cropLength: Double
  
  /**
   * Gets the [fill][Arrow] to fill this arrow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23fill">Online Documentation</a>
   */
  final val fill: Fill?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23length">Online Documentation</a>
   */
  final override val length: Double
  
  /**
   * Gets the scale factor for the length of this arrow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23lengthScale">Online Documentation</a>
   */
  final val lengthScale: Double
  
  /**
   * Gets the [stroke][Arrow] to render the outline of this arrow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23stroke">Online Documentation</a>
   */
  final val stroke: Stroke?
  
  /**
   * Gets the type of this arrow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23type">Online Documentation</a>
   */
  final val type: ArrowType
  
  /**
   * Gets the scale factor for the width of this arrow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23widthScale">Online Documentation</a>
   */
  final val widthScale: Double
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-clone">Online Documentation</a>
   */
  override fun clone(): Arrow
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-getBoundsProvider">Online Documentation</a>
   */
  override fun getBoundsProvider(
    edge: IEdge,
    atSource: Boolean,
    anchor: Point,
    direction: Point,
  ): IBoundsProvider
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-getVisualCreator">Online Documentation</a>
   */
  override fun getVisualCreator(
    edge: IEdge,
    atSource: Boolean,
    anchor: Point,
    direction: Point,
  ): IVisualCreator
  
  companion object : ClassMetadata<Arrow> {
  }
}
