// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Node
import web.svg.SVGElement
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * Fills an area with a SVG pattern.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PatternFill] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23PatternFill-constructor-PatternFill">Online Documentation</a>
 */
external  class PatternFill  () : Fill, ISvgDefsCreator {

/**
 * Gets or sets the content.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23content">Online Documentation</a>
 */
final var content: SvgVisual
/**
 * Gets or sets the origin of this pattern brush.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23origin">Online Documentation</a>
 */
final var origin: Point
/**
 * Gets or sets the size of this pattern brush.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23size">Online Documentation</a>
 */
final var size: Size
/**
 * Gets or sets the SVG view box of this pattern brush.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23viewBox">Online Documentation</a>
 */
final var viewBox: Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23PatternFill-method-accept">Online Documentation</a>
 */
 final override   fun accept( context: ICanvasContext ,
 node: Node ,
 id: String ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23PatternFill-method-createDefsElement">Online Documentation</a>
 */
 final override   fun createDefsElement( context: ICanvasContext ):SVGElement
/**
 * Determines whether this [PatternFill] is equal to the specified object.
 * @param [fill] The other [Fill] instance to compare.
 * @return `true`, if this [SolidColorFill] is equal to the other object; `false`, otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23PatternFill-method-hasSameValue">Online Documentation</a>
 */
 final override   fun hasSameValue( fill: Fill? ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PatternFill%23PatternFill-method-updateDefsElement">Online Documentation</a>
 */
 final override   fun updateDefsElement( context: ICanvasContext ,
 oldElement: SVGElement )

companion object : ClassMetadata<PatternFill> {
}
}

inline fun PatternFill(
    block: PatternFill.() -> Unit
): PatternFill {
    return PatternFill()
        .apply(block)
}
