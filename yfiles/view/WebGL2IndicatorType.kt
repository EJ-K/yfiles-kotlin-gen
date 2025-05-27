// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The line and pattern types the [WebGL2NodeIndicatorStyle], [WebGL2LabelIndicatorStyle], and [WebGL2EdgeIndicatorStyle] can display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType">Online Documentation</a>
 */
external sealed class WebGL2IndicatorType: YEnum<WebGL2IndicatorType> {
   companion object: EnumMetadata<WebGL2IndicatorType> {
       /**
 * A hatch pattern defined by two colors.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23HATCH_BRUSH">Online Documentation</a>
 */
val HATCH_BRUSH: WebGL2IndicatorType

/**
 * A continuous solid color line.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23SOLID">Online Documentation</a>
 */
val SOLID: WebGL2IndicatorType

/**
 * A continuous solid color line with a very thin inner and outer border.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23HAIRLINE_BORDER">Online Documentation</a>
 */
val HAIRLINE_BORDER: WebGL2IndicatorType

/**
 * A continuous solid color line with an outer border for shapes or left border in edge flow direction.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23OUTER_BORDER">Online Documentation</a>
 */
val OUTER_BORDER: WebGL2IndicatorType

/**
 * A continuous solid color line with an inner border for shapes or right border in edge flow direction.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23INNER_BORDER">Online Documentation</a>
 */
val INNER_BORDER: WebGL2IndicatorType

/**
 * Two parallel solid lines with no distance between them.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOUBLE_LINE">Online Documentation</a>
 */
val DOUBLE_LINE: WebGL2IndicatorType

/**
 * Two parallel solid color lines with space between them.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOUBLE_BORDER">Online Documentation</a>
 */
val DOUBLE_BORDER: WebGL2IndicatorType

/**
 * Two parallel solid lines with little space between them.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOUBLE_BORDER_THIN">Online Documentation</a>
 */
val DOUBLE_BORDER_THIN: WebGL2IndicatorType

/**
 * Two parallel solid lines with a lot of space between them.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOUBLE_BORDER_THICK">Online Documentation</a>
 */
val DOUBLE_BORDER_THICK: WebGL2IndicatorType

/**
 * A colored dashed line.
 * 
 * Value - `9`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DASH">Online Documentation</a>
 */
val DASH: WebGL2IndicatorType

/**
 * A colored dotted line.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOT">Online Documentation</a>
 */
val DOT: WebGL2IndicatorType

/**
 * A line with alternating colored dashes and dots.
 * 
 * Value - `11`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DASH_DOT">Online Documentation</a>
 */
val DASH_DOT: WebGL2IndicatorType

/**
 * A line with alternating colored dashes and two dots.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DASH_DOT_DOT">Online Documentation</a>
 */
val DASH_DOT_DOT: WebGL2IndicatorType

/**
 * A continuous line with alternating colors.
 * 
 * Value - `13`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23STRIPES">Online Documentation</a>
 */
val STRIPES: WebGL2IndicatorType

/**
 * A continuous solid color line with thin dashed inner and outer border.
 * 
 * Value - `14`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23DOTTED_HAIRLINE_BORDER">Online Documentation</a>
 */
val DOTTED_HAIRLINE_BORDER: WebGL2IndicatorType

/**
 * A solid halo effect around nodes.
 * 
 * Value - `28`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2IndicatorType%23HALO">Online Documentation</a>
 */
val HALO: WebGL2IndicatorType
   }
}
