// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.graph.IStripe
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan

/**
 * An animation for the [stripes][IStripe] in an [ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TableAnimation] class for the given table, the column widths, and row heights.
 * @param [table] The table to animate.
 * @param [columnLayout] The sizes of the **leaf** columns, in natural order.
 * @param [rowLayout] The sizes of the **leaf** rows, in natural order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23TableAnimation-constructor-TableAnimation">Online Documentation</a>
 */
external open class TableAnimation  ( table: ITable ,
 columnLayout: ReadonlyArray<Int> ,
 rowLayout: ReadonlyArray<Int> ) : IAnimation {

/**
 * Gets or sets the preferred duration of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23preferredDuration">Online Documentation</a>
 */
final override var preferredDuration: TimeSpan
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23TableAnimation-method-animate">Online Documentation</a>
 */
 override   fun animate( time: Double )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23TableAnimation-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * Create the animation for a single [IStripe]
 * @param [stripe] The stripe
 * @param [targetSize] The target size of the stripe
 * @return An animation that morphs the stripe size
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23TableAnimation-method-createStripeAnimation">Online Documentation</a>
 */
 open protected   fun createStripeAnimation( stripe: IStripe ,
 targetSize: Double ):IAnimation
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableAnimation%23TableAnimation-method-initialize">Online Documentation</a>
 */
 override   fun initialize()

companion object : ClassMetadata<TableAnimation> {
}
}
