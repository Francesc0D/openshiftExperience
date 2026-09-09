package open.shift.demo.hourly.thehour.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/api/time")
public class TimeController {

    @Operation(
            summary = "Get current hour",
            description = "Returns the current hour of the server"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Current hour retrieved successfully",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = HourResponse.class)
            )
    )
    @GetMapping("/hour")
    public HourResponse getCurrentHour() {
        return new HourResponse(LocalDateTime.now().getHour());
    }

    @lombok.AllArgsConstructor
    @lombok.Getter
    public static class HourResponse {
        private int hour;
    }
}
