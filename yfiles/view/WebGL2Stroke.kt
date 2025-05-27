// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A utility class that holds all properties of a stroke.
 * 
 * The stroke that is defined by instances of this type can be applied to the WebGL2 styles like [WebGL2ShapeNodeStyle], [WebGL2IconNodeStyle], [WebGL2GroupNodeStyle], [WebGL2PolylineEdgeStyle], [WebGL2ArcEdgeStyle], [WebGL2BridgeEdgeStyle], [WebGL2DefaultLabelStyle], and [WebGL2IconLabelStyle].
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * The strings applying to this scheme are converted to [WebGL2Stroke]s:
 * 
 * ```
 * '[thickness] [type] color'
 * 
 * thickness = thickness in px|thin|medium|thick
 * type = solid|dashed|dotted
 * color = CSS color strings
 * ```
 * Valid color strings are the same as for [color]. Square brackets mark optional declarations.
 * Examples:
 * 
 * ```
 * '3px blue'
 * 'thick blue'
 * ```
 * Currently, all [WebGL2Stroke]s are solid strokes. Dashed or dotted stroke patterns are not supported.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke">Online Documentation</a>
 * 
 * @constructor Creates a new stroke with the given color and optional thickness.
 * @param [color] The [color] for the stroke.
 * @param [thickness] The optional [thickness], which defaults to `1.0` if not specified.
 * @param [dashStyle] The optional [dashStyle], which defaults to [WebGL2DashStyle.SOLID]. For good visual results, set `lineCap` to a value other than [WebGL2LineCap.FLAT] (the default).
 * @param [lineCap] The optional [lineCap], which defaults to [WebGL2LineCap.FLAT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23WebGL2Stroke-constructor-WebGL2Stroke">Online Documentation</a>
 * 
 * @property color
 * Gets the color to use for the stroke.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23color">Online Documentation</a>
 * 
 * @property thickness
 * Gets the thickness to use for the stroke.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23thickness">Online Documentation</a>
 * 
 * @property dashStyle
 * Gets the dash style for the [WebGL2Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23dashStyle">Online Documentation</a>
 * 
 * @property lineCap
 * Gets the line cap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23lineCap">Online Documentation</a>
 */
external  class WebGL2Stroke  (
final val color: Color,
final val thickness: Double = definedExternally,
final val dashStyle: WebGL2DashStyle = definedExternally,
final val lineCap: WebGL2LineCap = definedExternally) : YObject {

companion object : ClassMetadata<WebGL2Stroke> {
/**
 * Gets a solid black stroke with thickness 1.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23BLACK">Online Documentation</a>
 */
 val BLACK: WebGL2Stroke
/**
 * An invisible stroke that has no thickness or color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23NONE">Online Documentation</a>
 */
 val NONE: WebGL2Stroke
/**
 * Creates a [WebGL2Stroke] instance from the given stroke-like object by performing automatic type conversion.
 * @param [strokeLike] The object to convert to a [WebGL2Stroke].
 * @return The given `strokeLike` if it is already a [WebGL2Stroke], or a new instance initialized to the values found in `strokeLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Stroke%23WebGL2Stroke-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( strokeLike: String ):WebGL2Stroke
}
}
