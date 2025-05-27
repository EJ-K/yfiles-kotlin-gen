// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGDefsElement
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.lang.YObject

/**
 * Helper class for [CanvasComponent] that manages the `defs` section of the SVG document.
 * @see [CanvasComponent.svgDefsManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SvgDefsManager] class.
 * @param [defs] The defs element of the svg document that will be managed by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23SvgDefsManager-constructor-SvgDefsManager">Online Documentation</a>
 * 
 * @property defs
 * Yields the `defs` element this instance is managing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23defs">Online Documentation</a>
 */
external open class SvgDefsManager  (
final val defs: SVGDefsElement) : YObject {

/**
 * Gets or sets a soft limit for the runtime of the [defs cleanup][cleanUpDefs] that the method tries to respect.
 * 
 * By default this is 50 milliseconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23cleanUpDuration">Online Documentation</a>
 */
final var cleanUpDuration: TimeSpan
/**
 * Gets or sets the interval for the timer to trigger the cleanup event.
 * 
 * By default this is 10 seconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23cleanUpTimerInterval">Online Documentation</a>
 */
final var cleanUpTimerInterval: TimeSpan
/**
 * Gets or sets the prefix to use for the [unique IDs][generateUniqueDefsId].
 * 
 * By default this is `ygc<number>`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23customPrefix">Online Documentation</a>
 */
final var customPrefix: String
/**
 * Triggers the clean up for svg defs on the provided control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23SvgDefsManager-method-cleanUpDefs">Online Documentation</a>
 */
 final   fun cleanUpDefs( canvas: CanvasComponent )
/**
 * Generates an ID that is globally unique among all [SvgDefsManager] instances.
 * @return A globally unique ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgDefsManager%23SvgDefsManager-method-generateUniqueDefsId">Online Documentation</a>
 */
 final   fun generateUniqueDefsId():String

companion object : ClassMetadata<SvgDefsManager> {
}
}
