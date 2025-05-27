// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import js.promise.Promise
import web.dom.Element
import web.svg.SVGElement
import web.svg.SVGImageElement
import web.svg.SVGSVGElement
import yfiles.collections.IEnumerable
import yfiles.geometry.Insets
import yfiles.geometry.Matrix
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.Func1

/**
 * This class sets up an [IRenderContext] object for exporting the contents of a [CanvasComponent] (see [createRenderContext][SvgExport]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport">Online Documentation</a>
 * 
 * @constructor Creates a new [SvgExport] instance for the given world bounds and scale.
 * @param [worldBounds] the bounds of the content to export, see [worldBounds][SvgExport]
 * @param [scale] the scale, see [scale][SvgExport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-constructor-SvgExport">Online Documentation</a>
 * 
 * @property worldBounds
 * Gets or sets the bounds of the content to export in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23worldBounds">Online Documentation</a>
 * 
 * @property scale
 * Gets or sets the scale for the export.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23scale">Online Documentation</a>
 */
open external class SvgExport (
open var worldBounds: Rect,
final var scale: Double = definedExternally)  {
  /**
   * Gets or sets the background color for the exported SVG.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23background">Online Documentation</a>
   */
  final var background: Fill?
  
  /**
   * Gets or sets a value indicating whether children of the [CanvasComponent]'s defs section that aren't known to the [SvgDefsManager] should be copied to the exported SVG.
   * 
   * The default value is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23copyDefsElements">Online Documentation</a>
   */
  final var copyDefsElements: Boolean
  
  /**
   * Gets or sets the CSS style sheet for the exported SVG.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23cssStyleSheet">Online Documentation</a>
   */
  final var cssStyleSheet: String?
  
  /**
   * Gets or sets a value indicating whether all external images should be inlined and encoded as Base64 data URIs in [exportSvgAsync][SvgExport].
   * @see [exportSvgAsync]
   * @see [shouldEncodeImageBase64]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23encodeImagesBase64">Online Documentation</a>
   */
  final var encodeImagesBase64: Boolean
  
  /**
   * Gets or sets a value indicating whether the IDs of an inline SVG image should be scoped to ensure that they are unique for the given image.
   * @see [inlineSvgImages]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23ensureUniqueIds">Online Documentation</a>
   */
  final var ensureUniqueIds: Boolean
  
  /**
   * Gets or sets a value indicating whether all SVG images should be inlined in the SVG element in [exportSvgAsync][SvgExport].
   * @see [exportSvgAsync]
   * @see [shouldInlineSvgImage]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23inlineSvgImages">Online Documentation</a>
   */
  final var inlineSvgImages: Boolean
  
  /**
   * Gets or sets the margins for the exported image.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23margins">Online Documentation</a>
   */
  final var margins: Insets
  
  /**
   * Gets or sets the [projection][CanvasComponent] to apply to the exported image.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23projection">Online Documentation</a>
   */
  final var projection: Matrix
  
  /**
   * Gets or sets a value indicating whether [HtmlVisual]s should be converted to bitmap images in the resulting SVG.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23rasterizeHtmlVisuals">Online Documentation</a>
   */
  final var rasterizeHtmlVisuals: Boolean
  
  /**
   * Gets or sets a value indicating whether the export should fail when images could not be inlined or encoded to Base64 or if it should continue and replace those elements with a fallback image.
   * 
   * The default setting is `false`, i.e. a fallback image is used.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23strictMode">Online Documentation</a>
   */
  final var strictMode: Boolean
  
  /**
   * Gets the resulting height of the target image with respect to export area, [scale][SvgExport] and [margins][SvgExport].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23viewHeight">Online Documentation</a>
   */
  final val viewHeight: Int
  
  /**
   * Gets the resulting width of the target image with respect to export area, [scale][SvgExport], and [margins][SvgExport].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23viewWidth">Online Documentation</a>
   */
  final val viewWidth: Int
  
  /**
   * Gets or sets the points in world coordinates that are enclosed in the exported area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23worldPoints">Online Documentation</a>
   */
  final var worldPoints: IEnumerable<Point>
  
  /**
   * Gets or sets the [zoom][ICanvasContext] property to use during the creation of the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23zoom">Online Documentation</a>
   */
  final var zoom: Double
  
  /**
   * Calculates the value to set the [scale][SvgExport] to in order to achieve the given target height (without [margins][SvgExport]).
   * @param [height] the height of the target image
   * @return the scale value to use
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-calculateScaleForHeight">Online Documentation</a>
   */
  fun calculateScaleForHeight(
    height: Double,
  ): Double
  
  /**
   * Calculates the value to set the [scale][SvgExport] to in order to achieve the given target width (without [margins][SvgExport]).
   * @param [width] the width of the target image
   * @return the scale value to use
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-calculateScaleForWidth">Online Documentation</a>
   */
  fun calculateScaleForWidth(
    width: Double,
  ): Double
  
  /**
   * Returns a suitable clip to use for the visual for this exporter.
   * @return The clip to set on the visual in order not to remder into the margins.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-createClip">Online Documentation</a>
   */
  open fun createClip(): Rect
  
  /**
   * Returns an initialized [IRenderContext] and changes the given transform and the clip bounds such that a part of the given [CanvasComponent] instance can be exported to an image.
   * @param [canvasComponent] The [CanvasComponent] instance to export.
   * @return An [IRenderContext] to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-createRenderContext">Online Documentation</a>
   */
  open fun createRenderContext(
    canvasComponent: CanvasComponent,
  ): IRenderContext
  
  /**
   * Returns a suitable transform to use for the visual to paint in the world coordinate system for this export.
   * @return The transform to use for the visual to paint in the world coordinate system.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-createWorldToIntermediateTransform">Online Documentation</a>
   */
  open fun createWorldToIntermediateTransform(): Matrix
  
  /**
   * Exports the contents of the [CanvasComponent] to a single, standalone SVG element.
   * @param [canvas] The canvas to be exported.
   * @return An SVG element with the canvas contents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-exportSvg">Online Documentation</a>
   */
  fun exportSvg(
    canvas: CanvasComponent,
  ): SVGSVGElement
  
  /**
   * Exports the contents of the [CanvasComponent] to a single, standalone SVG element.
   * @param [canvas] The canvas to be exported.
   * @param [renderCompletionCallback] An optional callback that will be called after the initial SVG is generated. The returned promise is awaited before any optional post-processing steps are applied.
   * @return A `Promise` that will resolve to an SVG element with the canvas contents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-exportSvgAsync">Online Documentation</a>
   */
  fun exportSvgAsync(
    canvas: CanvasComponent,
    renderCompletionCallback: Func1<Promise<Any>>?  = definedExternally,
  ): Promise<SVGSVGElement>
  
  /**
   * Fixes the `viewBox` attribute on SVG images that have been inlined for export.
   * @param [importedSvg] The root element of the SVG file that's referenced by the original image element.
   * @param [originalImage] The original image element that has been inlined.
   * @return A Promise that will be fulfilled once the `viewBox` attribute has been set.
   * @see [inlineSvgImages]
   * @see [exportSvgAsync]
   * @see [shouldInlineSvgImage]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-fixViewBoxAttribute">Online Documentation</a>
   */
  protected open fun fixViewBoxAttribute(
    importedSvg: Element,
    originalImage: Any /* SVGImageElement | HTMLImageElement */,
  ): Promise<Void>
  
  /**
   * Prepares the imported SVG element before it is placed in the DOM as a replacement for the original image.
   * @param [importedSvg] The root element of the SVG file that's referenced by the original image element.
   * @param [originalImage] The original image element that will be replaced.
   * @return The element that's actually placed in the DOM as a replacement of the `originalImage`.
   * @see [inlineSvgImages]
   * @see [exportSvgAsync]
   * @see [shouldInlineSvgImage]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-prepareInlinedImage">Online Documentation</a>
   */
  protected open fun prepareInlinedImage(
    importedSvg: Element,
    originalImage: Any /* SVGImageElement | HTMLImageElement */,
  ): Element
  
  /**
   * Specifies whether or not a given external image should be encoded and inlined as a Base64 data-url in the resulting SVG document.
   * @param [image] The image element that refers to the image to be encoded.
   * @return Whether the given image should be encoded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-shouldEncodeImageBase64">Online Documentation</a>
   */
  protected open fun shouldEncodeImageBase64(
    image: SVGImageElement,
  ): Boolean
  
  /**
   * Specifies whether or not an SVG image should be inlined.
   * @param [image] The image to be inlined.
   * @return Whether the given image should be inlined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-shouldInlineSvgImage">Online Documentation</a>
   */
  protected open fun shouldInlineSvgImage(
    image: SVGImageElement,
  ): Boolean
  
  companion object : ClassMetadata<SvgExport> {
    /**
     * Encodes the given SVG document as Data URI.
     * @param [svgXml] A string containing the SVG document.
     * @return A data URI of the SVG document.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-encodeSvgDataUrl">Online Documentation</a>
     */
    fun encodeSvgDataUrl(
      svgXml: String,
    ): String
    
    /**
     * Serializes the given SVG element to a string.
     * @param [svg] The SVG element to export.
     * @return A string representation of the SVG.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgExport%23SvgExport-method-exportSvgString">Online Documentation</a>
     */
    fun exportSvgString(
      svg: SVGElement,
    ): String
  }
}
